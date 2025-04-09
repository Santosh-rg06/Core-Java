package com.xworks.encapsulation;

import com.xworks.encapsulation.internal.KeychainUser;
import com.xworks.encapsulation.external.KeychainViewer;

public class KeychainRunner {
    public static void main(String[] args) {
        KeychainUser user = new KeychainUser();
        user.test();

        KeychainViewer viewer = new KeychainViewer();
        viewer.display();
    }
}
