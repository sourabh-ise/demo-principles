package org.learning.open_closed.profile;

import org.learning.open_closed.CustomerProfile;

public class HomeInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isLoyal() {
        return false;
    }
}
