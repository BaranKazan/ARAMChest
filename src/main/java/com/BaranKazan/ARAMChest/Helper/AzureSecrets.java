package com.BaranKazan.ARAMChest.Helper;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;

import java.io.Console;
import java.util.Map;

public class AzureSecrets {

    public static String getRiotApiKey() {
        String keyVaultName = System.getenv("KEY_VAULT_NAME");
        String keyVaultUri = "https://" + keyVaultName + ".vault.azure.net";
        System.out.println("DEBUGGING KEY:");
        System.out.println(keyVaultName);
        System.out.println(keyVaultUri);

        SecretClient secretClient = new SecretClientBuilder()
                .vaultUrl(keyVaultUri)
                .credential(new DefaultAzureCredentialBuilder().build())
                .buildClient();

        String secretName = "RIOT-API-KEY";
        String secretValue = "";

        KeyVaultSecret retrievedSecret = secretClient.getSecret(secretName);
        secretValue = retrievedSecret.getValue();

        return secretValue;
    }

}
