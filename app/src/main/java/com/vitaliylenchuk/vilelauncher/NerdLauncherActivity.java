package com.vitaliylenchuk.vilelauncher;

import androidx.fragment.app.Fragment;

public class NerdLauncherActivity extends com.vitaliylenchuk.vilelauncher.SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return NerdLauncherFragment.newInstance();
    }
}
