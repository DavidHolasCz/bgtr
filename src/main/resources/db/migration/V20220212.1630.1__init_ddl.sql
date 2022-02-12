CREATE TABLE project
(
    id_project bigserial NOT NULL
        CONSTRAINT project_pkey PRIMARY KEY,
    name varchar(50) NOT NULL
);

CREATE TABLE issue_state
(
    id_project_state bigserial NOT NULL
        CONSTRAINT project_state_pkey PRIMARY KEY,
    name varchar(50) NOT NULL
);

CREATE TABLE issue
(
    id_issue bigserial NOT NULL
        CONSTRAINT issue_pkey PRIMARY KEY,
    title   varchar(50) NOT NULL,
    description varchar(255),
    project_id bigserial NOT NULL,
    issue_state_id bigserial NOT NULL
);
