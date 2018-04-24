package com.myapplicationdev.android.tw_listview;

public class Module {
        private String name;
        private boolean modImage;

        public Module(String name, boolean modImage) {
            this.name = name;
            this.modImage = modImage;
        }

        public String getName() {
            return name;
        }

        public boolean isProgMod() {
            return modImage;
        }
}

