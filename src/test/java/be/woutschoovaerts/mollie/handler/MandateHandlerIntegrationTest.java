package be.woutschoovaerts.mollie.handler;

import be.woutschoovaerts.mollie.Client;
import be.woutschoovaerts.mollie.ClientBuilder;
import be.woutschoovaerts.mollie.data.common.Locale;
import be.woutschoovaerts.mollie.exception.MollieException;
import be.woutschoovaerts.mollie.data.common.Pagination;
import be.woutschoovaerts.mollie.data.customer.CustomerRequest;
import be.woutschoovaerts.mollie.data.mandate.MandateRequest;
import be.woutschoovaerts.mollie.data.customer.CustomerResponse;
import be.woutschoovaerts.mollie.data.mandate.MandateListResponse;
import be.woutschoovaerts.mollie.data.mandate.MandateResponse;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Optional;

import static be.woutschoovaerts.mollie.IntegrationTestConstants.API_KEY;
import static org.junit.jupiter.api.Assertions.*;

class MandateHandlerIntegrationTest {

    private Client client;

    @BeforeEach
    void setUp() {
        client = new ClientBuilder().withApiKey(API_KEY).build();
    }

    @Test
    void createMandate() throws MollieException {
        CustomerResponse customer = createCustomer();

        assertNotNull(customer);

        MandateResponse mandate = create(customer);

        assertNotNull(mandate);
    }

    @Test
    void getMandate() throws MollieException {
        CustomerResponse customer = createCustomer();

        assertNotNull(customer);

        MandateResponse mandate = create(customer);

        assertNotNull(mandate);

        mandate = client.mandates().getMandate(customer.getId(), mandate.getId());

        assertNotNull(mandate);
    }

    @Test
    void revokeMandate() throws MollieException {
        CustomerResponse customer = createCustomer();

        assertNotNull(customer);

        MandateResponse mandate = create(customer);

        assertNotNull(mandate);

        client.mandates().revokeMandate(customer.getId(), mandate.getId());
    }

    @Test
    void listMandates() throws MollieException {
        CustomerResponse customer = createCustomer();

        assertNotNull(customer);

        MandateResponse mandate = create(customer);

        assertNotNull(mandate);

        Pagination<MandateListResponse> mandates = client.mandates().listMandates(customer.getId());

        assertNotNull(mandates);
    }

    private CustomerResponse createCustomer() throws MollieException {
        long rand = RandomUtils.nextLong();
        CustomerRequest customerRequest = CustomerRequest.builder()
                .name(Optional.of("name" + rand))
                .email(Optional.of("name" + rand + "@feelio.be"))
                .locale(Optional.of(Locale.nl_BE))
                .build();

        return client.customers().createCustomer(customerRequest);
    }

    private MandateResponse create(CustomerResponse customer) throws MollieException {
        MandateRequest mandateRequest = MandateRequest.builder()
                .method("directdebit")
                .consumerName("John Doe")
                .consumerAccount("NL55INGB0000000000")
                .consumerBic(Optional.of("INGBNL2A"))
                .signatureDate(Optional.of(LocalDate.now()))
                .mandateReference(Optional.of("YOUR-COMPANY-MD13804"))
                .build();

        return client.mandates().createMandate(customer.getId(), mandateRequest);
    }
}