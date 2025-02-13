package com.pdlorenzo.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "This Schema will hold Account Information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber must not be a null value or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account Number of PDL Bank account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType must not be a null value or empty")
    @Schema(
            description = "Account type of PDL Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress must not be a null value or empty")
    @Schema(
            description = "PDL Bank branch address", example = "182 Tanauan, Batangas"
    )
    private String branchAddress;
}