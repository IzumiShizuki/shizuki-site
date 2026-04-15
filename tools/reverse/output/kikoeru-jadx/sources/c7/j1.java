package c7;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3654c;

    public j1(int i10, int i11, String str) {
        this.f3652a = str;
        this.f3653b = i10;
        this.f3654c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        int i10 = j1Var.f3654c;
        String str = j1Var.f3652a;
        int i11 = j1Var.f3653b;
        int i12 = this.f3654c;
        String str2 = this.f3652a;
        int i13 = this.f3653b;
        return (i13 < 0 || i11 < 0) ? TextUtils.equals(str2, str) && i12 == i10 : TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f3652a, Integer.valueOf(this.f3654c));
    }
}
