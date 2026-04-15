package c7;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Parcelable {
    public static final Parcelable.Creator<q1> CREATOR = new android.support.v4.media.a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3711c;

    public q1(float f10, int i10) {
        this.f3709a = i10;
        this.f3710b = f10;
    }

    public static q1 a(Parcelable parcelable) {
        q1 q1Var;
        q1 q1Var2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        q1Var2 = new q1(-1.0f, ratingStyle);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        q1Var = new q1(rating.hasHeart() ? 1.0f : 0.0f, 1);
                        break;
                    case 2:
                        q1Var = new q1(rating.isThumbUp() ? 1.0f : 0.0f, 2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        q1Var2 = e(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        q1Var2 = d(rating.getPercentRating());
                        break;
                }
                q1Var2 = q1Var;
            }
            q1Var2.getClass();
            q1Var2.f3711c = parcelable;
        }
        return q1Var2;
    }

    public static q1 d(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new q1(f10, 6);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static q1 e(float f10, int i10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else {
            if (i10 != 5) {
                Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new q1(f10, i10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float b() {
        int i10 = this.f3709a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && c()) {
            return this.f3710b;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.f3710b >= 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3709a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f3709a);
        sb.append(" rating=");
        float f10 = this.f3710b;
        sb.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3709a);
        parcel.writeFloat(this.f3710b);
    }
}
