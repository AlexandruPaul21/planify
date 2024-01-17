create table if not exists client
(
    id           uuid         not null
        constraint client_pkey
            primary key,
    budget       numeric(38)  not null,
    created_at   timestamp(6) not null,
    firstname    varchar(255) not null,
    lastname     varchar(255) not null,
    rating       integer      not null,
    username     varchar(255) not null,
    address      varchar(255) not null,
    phone_number varchar(255) not null
);

create table if not exists event
(
    id         uuid         not null
        constraint event_pkey
            primary key,
    event_name varchar(255) not null
);

create table if not exists provider
(
    id           uuid         not null
        constraint provider_pkey
            primary key,
    created_at   timestamp(6) not null,
    fiscal_code  varchar(255) not null,
    name         varchar(255) not null,
    rating       integer      not null,
    revenue      numeric(38)  not null,
    username     varchar(255) not null,
    address      varchar(255) not null,
    phone_number varchar(255) not null
);

create table if not exists service
(
    id           uuid         not null
        constraint service_pkey
            primary key,
    created_at   timestamp(6) not null,
    service_name varchar(255) not null
);

create table if not exists contract
(
    id                uuid         not null
        constraint contract_pkey
            primary key,
    price             numeric(38)  not null,
    provider_approved boolean      not null,
    status            varchar(255) not null
        constraint contract_status_check
            check ((status)::text = any
                   ((array ['ORDERED'::character varying, 'STARTED'::character varying, 'FINISHED'::character varying, 'PAID'::character varying])::text[])),
    client_id         uuid         not null
        constraint contract_client_fkey
            references client,
    provider_id       uuid         not null
        constraint contract_provider_fkey
            references provider,
    service_id        uuid         not null
        constraint contract_service_fkey
            references service
);

create table if not exists event_services
(
    event_id    uuid not null
        constraint event_services_event_fkey
            references event,
    services_id uuid not null
        constraint event_services_services_fkey
            references service
);

create table if not exists provider_offered_services
(
    provider_id         uuid not null
        constraint provider_offered_provider_fkey
            references provider,
    offered_services_id uuid not null
        constraint provider_offered_offered_services_fkey
            references service
);
