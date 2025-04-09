package com.xworks.encapsulation;

import com.xworks.encapsulation.internal.MutantUser;
import com.xworks.encapsulation.external.MutantViewer;

public class MutantRunner {
    public static void main(String[] args) {
        MutantUser user = new MutantUser();
        user.test();

        MutantViewer viewer = new MutantViewer();
        viewer.display();
    }
}
