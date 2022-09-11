
CREATE SCHEMA  AUTHORIZATION postgres;

COMMENT ON SCHEMA public IS 'standard public schema';

CREATE TABLE public."user" (
                               id uuid NOT NULL,
                               login varchar NOT NULL,
                               "password" varchar NOT NULL,
                               "role" varchar NOT NULL,
                               CONSTRAINT user_pk PRIMARY KEY (id),
                               CONSTRAINT user_un UNIQUE (id)
);


CREATE TABLE public.trainer (
                                id uuid NOT NULL,
                                user_id uuid NOT NULL,
                                "name" varchar NULL,
                                surname varchar NULL,
                                CONSTRAINT trainer_fk FOREIGN KEY (user_id) REFERENCES public."user"(id),
                                CONSTRAINT trainer_pk PRIMARY KEY (id),
                                CONSTRAINT trainer_un UNIQUE (id)
);

CREATE TABLE public.client (
                               id uuid NOT NULL,
                               user_id uuid NOT NULL,
                               "name" varchar NULL,
                               surname varchar NULL,
                               trainer_id uuid NULL,
                               CONSTRAINT client_pk PRIMARY KEY (id),
                               CONSTRAINT client_un UNIQUE (id),
                               CONSTRAINT client_fk FOREIGN KEY (user_id) REFERENCES public."user"(id),
                               CONSTRAINT client_fk_to_trainer FOREIGN KEY (trainer_id) REFERENCES public.trainer(id)
);
