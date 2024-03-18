insert into client
(id, budget, created_at, firstname, lastname, rating, username, address, phone_number, password, email)
values ('41046973-13e5-43a7-9334-270c8416d94f', 1000, CURRENT_TIMESTAMP, 'John', 'Smith', 4, 'JohnSmith',
        '1072 Madison Ave, New York, NY 10028, United States',
        '+40867350947', '$2a$10$OexTLiX.cQfG9Ir.mpdlP.QXYajWY9QANqO6tw7CFDpQdym0tuwve', 'john.smith@example.com'),

       ('936bcb24-fb54-4c85-acf7-db6c186d5da4', 3000, CURRENT_TIMESTAMP, 'Marie', 'Lagrange', -1, 'MarieL',
        '91 Rue de Rivoli, 75001 Paris, France',
        '+36773267785', '$2a$10$T57djJnkhfsSXTfpvRM5k.VqGmzeaS/.5Z3vSYoWcBHg9Koube8/6', 'marie.lagrange@example.com'),

       ('c0c66ac8-b2ec-4515-a027-139d6c93e64a', 4000, CURRENT_TIMESTAMP, 'Alex', 'Sirbu', 5, 'AlexS',
        'Strada Teodor Mihali, Cluj-Napoca 400394, Romania',
        '+40498185123', '$2a$10$mdO6jU90I215wK71L9XpjuB5AeQq.UXsl74nqycWaY4RxhQgHqpCe', 'alexandru.paul02@gmail.com');

insert into provider
(id, created_at, fiscal_code, name, rating, revenue, username, address, phone_number, password, email)
values ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', CURRENT_TIMESTAMP, 'RO9492071972', 'Master Events SRL', 4, 100,
        'MasterEvents', 'Calea Dorobanților nr. 25, Cluj-Napoca, Romania',
        '+40184306164', '$2a$10$amx1.IcwdzahrTlC/aD/7uc8ODNJkNGgZGLnB21mlSa5B/bUgesuK', 'master.events@example.com'),

       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', CURRENT_TIMESTAMP, 'FR9492071979', 'Unique Birthday', -1, 0,
        'UniqueBirthday', '193 Rue Solférino, 59000 Lille, France',
        '+33393492073', '$2a$10$7s/faFe3EhOmUUp7L9Cjuee6AKdEXM1uoA.X2mcGQfVt/wEQCN97C', 'unique@birthdays.com'),

       ('a7f7baa0-8449-469a-a995-43432915c8e6', CURRENT_TIMESTAMP, 'ES4290689496', 'Espania Events', -1, 0,
        'EspaniaEvents', 'C. de Alfonso XII, 30, Retiro, 28014 Madrid, Spain',
        '+34997936411', '$2a$10$LoCcrTvgcdmO3ummVY.TG.O/Q.mwJDHIgDK9vr7bXMImF66pyE/VK', 'espania.events@example.com'),

       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', CURRENT_TIMESTAMP, '7137040141', 'Bestique Events', -1, 0,
        'Bestique', 'Cal. Victoriei, 112, Bucuresti-Sector 1, Bucuresti, 010092, București 030167, Romania',
        '+40162592415', '$2a$10$bM22hTbATBjvJHUqM4ytje7zKMCPLm1cakQK5sUjd7nWQDVA/.1NC', 'bestique@example.com'),

       ('1ed83492-690a-48d1-926d-52451548c38a', CURRENT_TIMESTAMP, 'US447400631', 'Major Seller', 5, 200,
        'MajorSeller', '500-520 Campbell Dr, Las Vegas, NV 89107, USA',
        '+1237276885', '$2a$10$f815k1P7bQl/zbLy5wzZ6.08wJ6xzaS.CPXgTxItKhz2dOzAXYG3m', 'major.seller@personal.com');

insert into provider_offered_services(provider_id, offered_services_id)
values ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', 'f841bad7-d0ff-4d15-ad58-cb6e0fcf3c38'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '5688d99d-ca34-4929-a935-cf0b4ce16e57'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '78d2511d-4318-4ebd-95e2-65dc22ed693e'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '67048c72-0cc2-4c53-b0a9-2478ccbfe4fb'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', 'd559416a-b93e-417a-86ec-5e4a0457c5d2'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '8094ce86-bdd1-410c-a39a-2679eecc5bcf'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', 'd8912e72-2360-4c50-b3ae-b361fba06c15'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '1b53845a-82d9-4288-a01f-e33de3e2400f'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '7c263133-b8be-45ff-b5f2-4fed92b04ad3'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', 'a2531f0b-b755-4abe-8c92-6e4f90c064ec'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', 'e23a9322-e0d3-4390-a77b-d10b15b5acb7'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '53bfe573-3fb2-4e66-95fa-51028ac62a8e'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', 'f92287cd-eadd-4c23-b312-acc79c39a910'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '2248d4cd-52e6-4ef5-aa59-f77cc79d1204'),
       ('62c0908f-b0cf-47e0-b2e0-e9e7ced28d21', '08b5a9bd-cd9d-4c83-9b01-43545feeae39'),

       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', 'f841bad7-d0ff-4d15-ad58-cb6e0fcf3c38'),
       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', '67048c72-0cc2-4c53-b0a9-2478ccbfe4fb'),
       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', '1b53845a-82d9-4288-a01f-e33de3e2400f'),
       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', '7c263133-b8be-45ff-b5f2-4fed92b04ad3'),
       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', 'a2531f0b-b755-4abe-8c92-6e4f90c064ec'),
       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', 'e23a9322-e0d3-4390-a77b-d10b15b5acb7'),
       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', '53bfe573-3fb2-4e66-95fa-51028ac62a8e'),
       ('f8c72f96-6549-4d3d-adb8-6e48c755cf5e', '08b5a9bd-cd9d-4c83-9b01-43545feeae39'),

       ('a7f7baa0-8449-469a-a995-43432915c8e6', 'f841bad7-d0ff-4d15-ad58-cb6e0fcf3c38'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', '5688d99d-ca34-4929-a935-cf0b4ce16e57'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', '78d2511d-4318-4ebd-95e2-65dc22ed693e'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', '8094ce86-bdd1-410c-a39a-2679eecc5bcf'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', 'd8912e72-2360-4c50-b3ae-b361fba06c15'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', '1b53845a-82d9-4288-a01f-e33de3e2400f'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', 'a2531f0b-b755-4abe-8c92-6e4f90c064ec'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', 'e23a9322-e0d3-4390-a77b-d10b15b5acb7'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', '53bfe573-3fb2-4e66-95fa-51028ac62a8e'),
       ('a7f7baa0-8449-469a-a995-43432915c8e6', '08b5a9bd-cd9d-4c83-9b01-43545feeae39'),

       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', 'f841bad7-d0ff-4d15-ad58-cb6e0fcf3c38'),
       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', '5688d99d-ca34-4929-a935-cf0b4ce16e57'),
       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', 'd559416a-b93e-417a-86ec-5e4a0457c5d2'),
       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', '1b53845a-82d9-4288-a01f-e33de3e2400f'),
       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', '53bfe573-3fb2-4e66-95fa-51028ac62a8e'),
       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', '2248d4cd-52e6-4ef5-aa59-f77cc79d1204'),
       ('b2fbb728-cc71-4a0f-9bbe-252baec71b9b', '08b5a9bd-cd9d-4c83-9b01-43545feeae39'),

       ('1ed83492-690a-48d1-926d-52451548c38a', 'f841bad7-d0ff-4d15-ad58-cb6e0fcf3c38'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '5688d99d-ca34-4929-a935-cf0b4ce16e57'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '78d2511d-4318-4ebd-95e2-65dc22ed693e'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '67048c72-0cc2-4c53-b0a9-2478ccbfe4fb'),
       ('1ed83492-690a-48d1-926d-52451548c38a', 'd559416a-b93e-417a-86ec-5e4a0457c5d2'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '8094ce86-bdd1-410c-a39a-2679eecc5bcf'),
       ('1ed83492-690a-48d1-926d-52451548c38a', 'd8912e72-2360-4c50-b3ae-b361fba06c15'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '1b53845a-82d9-4288-a01f-e33de3e2400f'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '7c263133-b8be-45ff-b5f2-4fed92b04ad3'),
       ('1ed83492-690a-48d1-926d-52451548c38a', 'a2531f0b-b755-4abe-8c92-6e4f90c064ec'),
       ('1ed83492-690a-48d1-926d-52451548c38a', 'e23a9322-e0d3-4390-a77b-d10b15b5acb7'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '53bfe573-3fb2-4e66-95fa-51028ac62a8e'),
       ('1ed83492-690a-48d1-926d-52451548c38a', 'f92287cd-eadd-4c23-b312-acc79c39a910'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '2248d4cd-52e6-4ef5-aa59-f77cc79d1204'),
       ('1ed83492-690a-48d1-926d-52451548c38a', '08b5a9bd-cd9d-4c83-9b01-43545feeae39');
