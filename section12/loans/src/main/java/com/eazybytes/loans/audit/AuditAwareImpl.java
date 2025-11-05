package com.eazybytes.loans.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAware")
public class AuditAwareImpl implements AuditorAware<String> {
    /**
     * @return current editor of loan details
     */
    @Override
    public Optional<String> getCurrentAuditor() {

        return Optional.of("LOANS_MS");
    }
}
