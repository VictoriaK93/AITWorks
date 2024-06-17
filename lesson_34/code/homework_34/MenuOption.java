package homework_34;

public enum MenuOption {
        ADD_NOTE(1, "Add a note"),
        SEE_ALL_POSTS(2, "See all notes"),
        DELETE_ENTRY(3, "Delete entry (by number)"),
        GO_OUT(4, "Go out (Exit)");

        private final int number;
        private final String action;

        MenuOption(int number, String action) {
            this.number = number;
            this.action = action;
        }

        public int getNumber() {
            return number;
        }

        public String getAction() {
            return action;
        }
    }



