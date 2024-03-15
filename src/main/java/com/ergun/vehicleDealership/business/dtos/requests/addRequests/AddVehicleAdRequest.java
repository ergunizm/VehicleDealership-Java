package com.ergun.vehicleDealership.business.dtos.requests.addRequests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddVehicleAdRequest {
    @NotNull(message = "Can not be empty")
    @NotBlank(message = "Can not be empty")
    private Long vehicleId;
    @NotNull(message = "Can not be empty")
    @NotBlank(message = "Can not be empty")
    private Long sellerId;
}
