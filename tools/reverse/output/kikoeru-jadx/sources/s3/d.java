package s3;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19372f;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f19367a = str;
        str2.getClass();
        this.f19368b = str2;
        this.f19369c = str3;
        list.getClass();
        this.f19370d = list;
        this.f19371e = str4;
        this.f19372f = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        sb.append("-");
        sb.append(str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f19367a + ", mProviderPackage: " + this.f19368b + ", mQuery: " + this.f19369c + ", mSystemFont: " + this.f19371e + ", mVariationSettings: " + this.f19372f + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f19370d;
            if (i10 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i10++;
        }
    }
}
