(ns eventing.types)

(derive 'sales/purchase 'sales/all)
(derive 'sales/purchase 'finance/accounts-receivable)
(derive 'finance/accounts-receivable 'finance/all)
(derive 'finance/all 'events/all)
(derive 'sales/all 'events/all)
(derive 'sales/RFQ 'sales/lead-generation)
(derive 'sales/lead-generation 'sales/all)
(derive 'auth/new-user 'sales/lead-generation)
(derive 'auth/new-user 'security/all)
(derive 'security/all 'events/all)
