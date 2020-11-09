package ru.job4j.anime;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        int row =  0;
        int col = 0;
        boolean flag = false;
        for(int i = 0; i < places.length; i++) {
           for(int j = 0; j < places[i].length; j++) {
               Place place_left = null;
               Place place_top = null;
               Place place_right = null;
               Place place_bottom = null;
                if ( j - 1 >= 0 ) {
                    place_left = places[ i ][ j-1 ];
                }
                else if ( j  <= places[i].length - 1 ) {
                    place_right = places[ i ][ j + 1 ];
                }
                else if ( i - 1 >= 0 ) {
                    place_top = places[ i-1 ][ j ];
                }
               else {
                    place_bottom = places[ i + 1 ][ j ];
                }
                if (place_left == null &&
                       place_top == null &&
                       place_right == null &&
                       place_bottom == null &&
                       places[i][j] == null) {
                    flag = true;
                    row = i;
                    col = j;
                    break;
                }
            }
           if ( flag ) {
               break;
           }
        }
            return flag ? new Place(row, col) : null;
        }


    public static class Place {
        private int row;

        private int cell;

        public Place( int row ,int cell ) {
            this.row=row;
            this.cell=cell;
        }

        @Override
        public boolean equals( Object o ) {
            if ( this == o ){
                return true;
            }
            if ( o == null || getClass () != o.getClass () ){
                return false;
            }
            Place place=(Place) o;
            return row == place.row &&
                    cell == place.cell;
        }

        @Override
        public int hashCode( ) {
            return Objects.hash (row ,cell);
        }
    }
}

//   if (places[i][j] == null && places[i][places.length - (places.length - j - 1)] == null
//      && places[places.length - (places.length - i - 1)][j] == null) {