alter table client add column email varchar(56);

alter table provider add column email varchar(56);

alter table contract add column advance_payment numeric(38);
alter table contract add column client_notes varchar(256);
alter table contract add column provider_notes varchar(256);
