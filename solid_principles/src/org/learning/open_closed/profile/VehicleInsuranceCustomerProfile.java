package org.learning.open_closed.profile;

import org.learning.open_closed.CustomerProfile;

public class VehicleInsuranceCustomerProfile implements CustomerProfile {
    @Override
    public boolean isLoyal() {
        return false;
    }
}
