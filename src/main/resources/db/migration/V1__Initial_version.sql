CREATE TABLE post (
  id BIGINT IDENTITY PRIMARY KEY,
  name NVARCHAR(128) NOT NULL,
  subject NVARCHAR(128) NOT NULL,
  content NTEXT NOT NULL,
  date TIMESTAMP NOT NULL,
  host_address NVARCHAR(128) NOT NULL,
);

CREATE TABLE image (
  id BIGINT IDENTITY PRIMARY KEY,
  post_id BIGINT NOT NULL,
  height INTEGER NOT NULL,
  width INTEGER NOT NULL,
  size_byte BIGINT NOT NULL,
  file_name NVARCHAR(128) NOT NULL
)