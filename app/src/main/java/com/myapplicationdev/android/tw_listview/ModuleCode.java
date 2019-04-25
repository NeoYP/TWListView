package com.myapplicationdev.android.tw_listview;

public class ModuleCode {
    private String moduleCode;
    private boolean picture;

    public ModuleCode(String moduleCode, boolean picture) {
        this.moduleCode = moduleCode;
        this.picture = picture;
    }

    public String getModuleCode() {
        return moduleCode;
    }


    public boolean isPicture() {
        return picture;
    }


}
