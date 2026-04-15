package c7;

import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f3699a;

    public q() {
        this.f3699a = new Bundle();
    }

    public void a(String str, Bitmap bitmap) {
        Integer num = (Integer) r0.f3714c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(q.t0.D("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f3699a.putParcelable(str, bitmap);
    }

    public void b(long j10, String str) {
        Integer num = (Integer) r0.f3714c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(q.t0.D("The ", str, " key cannot be used to put a long"));
        }
        this.f3699a.putLong(str, j10);
    }

    public void c(String str, q1 q1Var) {
        Object obj;
        float f10 = q1Var.f3710b;
        int i10 = q1Var.f3709a;
        Integer num = (Integer) r0.f3714c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(q.t0.D("The ", str, " key cannot be used to put a Rating"));
        }
        if (q1Var.f3711c != null) {
            obj = q1Var.f3711c;
        } else {
            if (q1Var.c()) {
                switch (i10) {
                    case 1:
                        q1Var.f3711c = Rating.newHeartRating(i10 == 1 && f10 == 1.0f);
                        break;
                    case 2:
                        q1Var.f3711c = Rating.newThumbRating(i10 == 2 && f10 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        q1Var.f3711c = Rating.newStarRating(i10, q1Var.b());
                        break;
                    case 6:
                        if (i10 != 6 || !q1Var.c()) {
                            f10 = -1.0f;
                        }
                        q1Var.f3711c = Rating.newPercentageRating(f10);
                        break;
                    default:
                        obj = null;
                        break;
                }
            } else {
                q1Var.f3711c = Rating.newUnratedRating(i10);
            }
            obj = q1Var.f3711c;
        }
        this.f3699a.putParcelable(str, (Parcelable) obj);
    }

    public void d(String str, String str2) {
        Integer num = (Integer) r0.f3714c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(q.t0.D("The ", str, " key cannot be used to put a String"));
        }
        this.f3699a.putCharSequence(str, str2);
    }

    public void e(CharSequence charSequence, String str) {
        Integer num = (Integer) r0.f3714c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(q.t0.D("The ", str, " key cannot be used to put a CharSequence"));
        }
        this.f3699a.putCharSequence(str, charSequence);
    }

    public q(Bundle bundle) {
        this.f3699a = bundle;
    }
}
