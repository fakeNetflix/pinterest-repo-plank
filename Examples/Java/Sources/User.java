//
// User.java
// Autogenerated by plank
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

package com.pinterest.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class User {

    public enum UserEmailFrequency {
        @SerializedName("unset") UNSET, @SerializedName("immediate") IMMEDIATE, @SerializedName("daily") DAILY;
    }

    public static final String TYPE = "user";

    @SerializedName("bio") private @Nullable String bio;
    @SerializedName("counts") private @Nullable Map<String, Integer> counts;
    @SerializedName("created_at") private @Nullable Date createdAt;
    @SerializedName("email_frequency") private @Nullable UserEmailFrequency emailFrequency;
    @SerializedName("first_name") private @Nullable String firstName;
    @SerializedName("id") private @Nullable String uid;
    @SerializedName("image") private @Nullable Image image;
    @SerializedName("last_name") private @Nullable String lastName;
    @SerializedName("type") private @Nullable String type;
    @SerializedName("username") private @Nullable String username;

    static final private int BIO_INDEX = 0;
    static final private int COUNTS_INDEX = 1;
    static final private int CREATED_AT_INDEX = 2;
    static final private int EMAIL_FREQUENCY_INDEX = 3;
    static final private int FIRST_NAME_INDEX = 4;
    static final private int ID_INDEX = 5;
    static final private int IMAGE_INDEX = 6;
    static final private int LAST_NAME_INDEX = 7;
    static final private int TYPE_INDEX = 8;
    static final private int USERNAME_INDEX = 9;

    private boolean[] _bits = new boolean[10];

    private User(
        @Nullable String bio,
        @Nullable Map<String, Integer> counts,
        @Nullable Date createdAt,
        @Nullable UserEmailFrequency emailFrequency,
        @Nullable String firstName,
        @Nullable String uid,
        @Nullable Image image,
        @Nullable String lastName,
        @Nullable String type,
        @Nullable String username,
        boolean[] _bits
    ) {
        this.bio = bio;
        this.counts = counts;
        this.createdAt = createdAt;
        this.emailFrequency = emailFrequency;
        this.firstName = firstName;
        this.uid = uid;
        this.image = image;
        this.lastName = lastName;
        this.type = type;
        this.username = username;
        this._bits = _bits;
    }

    public static User.Builder builder() {
        return new User.Builder();
    }

    public User.Builder toBuilder() {
        return new User.Builder(this);
    }

    public User mergeFrom(User model) {
        User.Builder builder = this.toBuilder();
        builder.mergeFrom(model);
        return builder.build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User that = (User) o;
        return Objects.equals(this.bio, that.bio) &&
        Objects.equals(this.counts, that.counts) &&
        Objects.equals(this.createdAt, that.createdAt) &&
        Objects.equals(this.emailFrequency, that.emailFrequency) &&
        Objects.equals(this.firstName, that.firstName) &&
        Objects.equals(this.uid, that.uid) &&
        Objects.equals(this.image, that.image) &&
        Objects.equals(this.lastName, that.lastName) &&
        Objects.equals(this.type, that.type) &&
        Objects.equals(this.username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bio,
        counts,
        createdAt,
        emailFrequency,
        firstName,
        uid,
        image,
        lastName,
        type,
        username);
    }

    public @Nullable String getBio() {
        return this.bio;
    }

    public @Nullable Map<String, Integer> getCounts() {
        return this.counts;
    }

    public @Nullable Date getCreatedAt() {
        return this.createdAt;
    }

    public @Nullable UserEmailFrequency getEmailFrequency() {
        return this.emailFrequency;
    }

    public @Nullable String getFirstName() {
        return this.firstName;
    }

    public @Nullable String getUid() {
        return this.uid;
    }

    public @Nullable Image getImage() {
        return this.image;
    }

    public @Nullable String getLastName() {
        return this.lastName;
    }

    public @Nullable String getType() {
        return this.type;
    }

    public @Nullable String getUsername() {
        return this.username;
    }

    public boolean getBioIsSet() {
        return this._bits.length > BIO_INDEX && this._bits[BIO_INDEX];
    }

    public boolean getCountsIsSet() {
        return this._bits.length > COUNTS_INDEX && this._bits[COUNTS_INDEX];
    }

    public boolean getCreatedAtIsSet() {
        return this._bits.length > CREATED_AT_INDEX && this._bits[CREATED_AT_INDEX];
    }

    public boolean getEmailFrequencyIsSet() {
        return this._bits.length > EMAIL_FREQUENCY_INDEX && this._bits[EMAIL_FREQUENCY_INDEX];
    }

    public boolean getFirstNameIsSet() {
        return this._bits.length > FIRST_NAME_INDEX && this._bits[FIRST_NAME_INDEX];
    }

    public boolean getUidIsSet() {
        return this._bits.length > ID_INDEX && this._bits[ID_INDEX];
    }

    public boolean getImageIsSet() {
        return this._bits.length > IMAGE_INDEX && this._bits[IMAGE_INDEX];
    }

    public boolean getLastNameIsSet() {
        return this._bits.length > LAST_NAME_INDEX && this._bits[LAST_NAME_INDEX];
    }

    public boolean getTypeIsSet() {
        return this._bits.length > TYPE_INDEX && this._bits[TYPE_INDEX];
    }

    public boolean getUsernameIsSet() {
        return this._bits.length > USERNAME_INDEX && this._bits[USERNAME_INDEX];
    }

    public static class Builder {

        @SerializedName("bio") private @Nullable String bio;
        @SerializedName("counts") private @Nullable Map<String, Integer> counts;
        @SerializedName("created_at") private @Nullable Date createdAt;
        @SerializedName("email_frequency") private @Nullable UserEmailFrequency emailFrequency;
        @SerializedName("first_name") private @Nullable String firstName;
        @SerializedName("id") private @Nullable String uid;
        @SerializedName("image") private @Nullable Image image;
        @SerializedName("last_name") private @Nullable String lastName;
        @SerializedName("type") private @Nullable String type;
        @SerializedName("username") private @Nullable String username;

        private boolean[] _bits = new boolean[10];

        private Builder() {
        }

        private Builder(@NonNull User model) {
            this.bio = model.bio;
            this.counts = model.counts;
            this.createdAt = model.createdAt;
            this.emailFrequency = model.emailFrequency;
            this.firstName = model.firstName;
            this.uid = model.uid;
            this.image = model.image;
            this.lastName = model.lastName;
            this.type = model.type;
            this.username = model.username;
            this._bits = model._bits;
        }

        public Builder setBio(@Nullable String value) {
            this.bio = value;
            if (this._bits.length > BIO_INDEX) {
                this._bits[BIO_INDEX] = true;
            }
            return this;
        }

        public Builder setCounts(@Nullable Map<String, Integer> value) {
            this.counts = value;
            if (this._bits.length > COUNTS_INDEX) {
                this._bits[COUNTS_INDEX] = true;
            }
            return this;
        }

        public Builder setCreatedAt(@Nullable Date value) {
            this.createdAt = value;
            if (this._bits.length > CREATED_AT_INDEX) {
                this._bits[CREATED_AT_INDEX] = true;
            }
            return this;
        }

        public Builder setEmailFrequency(@Nullable UserEmailFrequency value) {
            this.emailFrequency = value;
            if (this._bits.length > EMAIL_FREQUENCY_INDEX) {
                this._bits[EMAIL_FREQUENCY_INDEX] = true;
            }
            return this;
        }

        public Builder setFirstName(@Nullable String value) {
            this.firstName = value;
            if (this._bits.length > FIRST_NAME_INDEX) {
                this._bits[FIRST_NAME_INDEX] = true;
            }
            return this;
        }

        public Builder setUid(@Nullable String value) {
            this.uid = value;
            if (this._bits.length > ID_INDEX) {
                this._bits[ID_INDEX] = true;
            }
            return this;
        }

        public Builder setImage(@Nullable Image value) {
            this.image = value;
            if (this._bits.length > IMAGE_INDEX) {
                this._bits[IMAGE_INDEX] = true;
            }
            return this;
        }

        public Builder setLastName(@Nullable String value) {
            this.lastName = value;
            if (this._bits.length > LAST_NAME_INDEX) {
                this._bits[LAST_NAME_INDEX] = true;
            }
            return this;
        }

        public Builder setType(@Nullable String value) {
            this.type = value;
            if (this._bits.length > TYPE_INDEX) {
                this._bits[TYPE_INDEX] = true;
            }
            return this;
        }

        public Builder setUsername(@Nullable String value) {
            this.username = value;
            if (this._bits.length > USERNAME_INDEX) {
                this._bits[USERNAME_INDEX] = true;
            }
            return this;
        }

        public @Nullable String getBio() {
            return this.bio;
        }

        public @Nullable Map<String, Integer> getCounts() {
            return this.counts;
        }

        public @Nullable Date getCreatedAt() {
            return this.createdAt;
        }

        public @Nullable UserEmailFrequency getEmailFrequency() {
            return this.emailFrequency;
        }

        public @Nullable String getFirstName() {
            return this.firstName;
        }

        public @Nullable String getUid() {
            return this.uid;
        }

        public @Nullable Image getImage() {
            return this.image;
        }

        public @Nullable String getLastName() {
            return this.lastName;
        }

        public @Nullable String getType() {
            return this.type;
        }

        public @Nullable String getUsername() {
            return this.username;
        }

        public User build() {
            return new User(
            this.bio,
            this.counts,
            this.createdAt,
            this.emailFrequency,
            this.firstName,
            this.uid,
            this.image,
            this.lastName,
            this.type,
            this.username,
            this._bits
            );
        }

        public void mergeFrom(User model) {
            if (model.getBioIsSet()) {
                this.bio = model.bio;
                if (this._bits.length > BIO_INDEX) {
                    this._bits[BIO_INDEX] = true;
                }
            }
            if (model.getCountsIsSet()) {
                this.counts = model.counts;
                if (this._bits.length > COUNTS_INDEX) {
                    this._bits[COUNTS_INDEX] = true;
                }
            }
            if (model.getCreatedAtIsSet()) {
                this.createdAt = model.createdAt;
                if (this._bits.length > CREATED_AT_INDEX) {
                    this._bits[CREATED_AT_INDEX] = true;
                }
            }
            if (model.getEmailFrequencyIsSet()) {
                this.emailFrequency = model.emailFrequency;
                if (this._bits.length > EMAIL_FREQUENCY_INDEX) {
                    this._bits[EMAIL_FREQUENCY_INDEX] = true;
                }
            }
            if (model.getFirstNameIsSet()) {
                this.firstName = model.firstName;
                if (this._bits.length > FIRST_NAME_INDEX) {
                    this._bits[FIRST_NAME_INDEX] = true;
                }
            }
            if (model.getUidIsSet()) {
                this.uid = model.uid;
                if (this._bits.length > ID_INDEX) {
                    this._bits[ID_INDEX] = true;
                }
            }
            if (model.getImageIsSet()) {
                this.image = model.image;
                if (this._bits.length > IMAGE_INDEX) {
                    this._bits[IMAGE_INDEX] = true;
                }
            }
            if (model.getLastNameIsSet()) {
                this.lastName = model.lastName;
                if (this._bits.length > LAST_NAME_INDEX) {
                    this._bits[LAST_NAME_INDEX] = true;
                }
            }
            if (model.getTypeIsSet()) {
                this.type = model.type;
                if (this._bits.length > TYPE_INDEX) {
                    this._bits[TYPE_INDEX] = true;
                }
            }
            if (model.getUsernameIsSet()) {
                this.username = model.username;
                if (this._bits.length > USERNAME_INDEX) {
                    this._bits[USERNAME_INDEX] = true;
                }
            }
        }
    }

    public static class UserTypeAdapterFactory implements TypeAdapterFactory {

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (!User.class.isAssignableFrom(typeToken.getRawType())) {
                return null;
            }
            return (TypeAdapter<T>) new UserTypeAdapter(gson, this, typeToken);
        }
    }

    public static class UserTypeAdapter extends TypeAdapter<User> {

        final private TypeAdapter<User> delegateTypeAdapter;

        final private TypeAdapter<Date> dateTypeAdapter;
        final private TypeAdapter<Image> imageTypeAdapter;
        final private TypeAdapter<Map<String, Integer>> map_String__Integer_TypeAdapter;
        final private TypeAdapter<String> stringTypeAdapter;
        final private TypeAdapter<UserEmailFrequency> userEmailFrequencyTypeAdapter;

        public UserTypeAdapter(Gson gson, UserTypeAdapterFactory factory, TypeToken typeToken) {
            this.delegateTypeAdapter = gson.getDelegateAdapter(factory, typeToken);
            this.dateTypeAdapter = gson.getAdapter(Date.class).nullSafe();
            this.imageTypeAdapter = gson.getAdapter(Image.class).nullSafe();
            this.map_String__Integer_TypeAdapter = gson.getAdapter(new TypeToken<Map<String, Integer>>(){}).nullSafe();
            this.stringTypeAdapter = gson.getAdapter(String.class).nullSafe();
            this.userEmailFrequencyTypeAdapter = gson.getAdapter(UserEmailFrequency.class).nullSafe();
        }

        @Override
        public void write(JsonWriter writer, User value) throws IOException {
            this.delegateTypeAdapter.write(writer, value);
        }

        @Override
        public User read(JsonReader reader) throws IOException {
            if (reader.peek() == JsonToken.NULL) {
                reader.nextNull();
                return null;
            }
            Builder builder = User.builder();
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                switch (name) {
                    case ("bio"):
                        builder.setBio(stringTypeAdapter.read(reader));
                        break;
                    case ("counts"):
                        builder.setCounts(map_String__Integer_TypeAdapter.read(reader));
                        break;
                    case ("created_at"):
                        builder.setCreatedAt(dateTypeAdapter.read(reader));
                        break;
                    case ("email_frequency"):
                        builder.setEmailFrequency(userEmailFrequencyTypeAdapter.read(reader));
                        break;
                    case ("first_name"):
                        builder.setFirstName(stringTypeAdapter.read(reader));
                        break;
                    case ("id"):
                        builder.setUid(stringTypeAdapter.read(reader));
                        break;
                    case ("image"):
                        builder.setImage(imageTypeAdapter.read(reader));
                        break;
                    case ("last_name"):
                        builder.setLastName(stringTypeAdapter.read(reader));
                        break;
                    case ("type"):
                        builder.setType(stringTypeAdapter.read(reader));
                        break;
                    case ("username"):
                        builder.setUsername(stringTypeAdapter.read(reader));
                        break;
                    default:
                        reader.skipValue();
                }
            }
            reader.endObject();
            return builder.build();
        }
    }
}
