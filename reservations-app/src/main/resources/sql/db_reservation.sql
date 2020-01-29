--
-- PostgreSQL database dump
--

-- Dumped from database version 10.8
-- Dumped by pg_dump version 10.8

-- Started on 2020-01-29 12:07:45

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12924)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2806 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 16399)
-- Name: parameters; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.parameters (
    parameters_id integer NOT NULL,
    code character varying(20),
    description character varying(50),
    reference_code character varying(20)
);


ALTER TABLE public.parameters OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 16414)
-- Name: reservation; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.reservation (
    reservation_id integer NOT NULL,
    reservation_code character varying(20),
    date_of_reservation timestamp without time zone,
    phone_number character varying(10),
    pin character varying(5),
    email_address character varying(50),
    parameters_code character varying(50)
);


ALTER TABLE public.reservation OWNER TO postgres;

--
-- TOC entry 2797 (class 0 OID 16399)
-- Dependencies: 196
-- Data for Name: parameters; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (1, 'MACHINE', 'MACHINE', '');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (2, '00001', 'MACHINE 00001', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (26, '00025', 'MACHINE 00025', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (3, '00002', 'MACHINE 00002', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (4, '00003', 'MACHINE 00003', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (5, '00004', 'MACHINE 00004', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (6, '00005', 'MACHINE 00005', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (7, '00006', 'MACHINE 00006', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (8, '00007', 'MACHINE 00007', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (9, '00008', 'MACHINE 00008', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (10, '00009', 'MACHINE 00090', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (11, '00010', 'MACHINE 00010', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (12, '00011', 'MACHINE 00011', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (13, '00012', 'MACHINE 00012', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (14, '00013', 'MACHINE 00013', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (15, '00014', 'MACHINE 00014', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (16, '00015', 'MACHINE 00015', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (17, '00016', 'MACHINE 00016', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (18, '00017', 'MACHINE 00017', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (19, '00018', 'MACHINE 00018', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (20, '00019', 'MACHINE 00019', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (21, '00020', 'MACHINE 00020', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (22, '00021', 'MACHINE 00021', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (23, '00022', 'MACHINE 00022', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (24, '00023', 'MACHINE 00023', 'MACHINE');
INSERT INTO public.parameters (parameters_id, code, description, reference_code) VALUES (25, '00024', 'MACHINE 00024', 'MACHINE');


--
-- TOC entry 2798 (class 0 OID 16414)
-- Dependencies: 197
-- Data for Name: reservation; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.reservation (reservation_id, reservation_code, date_of_reservation, phone_number, pin, email_address, parameters_code) VALUES (1, 'R00001', '2003-01-01 00:00:00', '562147895', '14587', 'user@laundromat.com', 'machine');


--
-- TOC entry 2673 (class 2606 OID 16403)
-- Name: parameters pk_parameters; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.parameters
    ADD CONSTRAINT pk_parameters PRIMARY KEY (parameters_id);


--
-- TOC entry 2675 (class 2606 OID 16418)
-- Name: reservation pk_reservation; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT pk_reservation PRIMARY KEY (reservation_id);


-- Completed on 2020-01-29 12:07:46

--
-- PostgreSQL database dump complete
--

