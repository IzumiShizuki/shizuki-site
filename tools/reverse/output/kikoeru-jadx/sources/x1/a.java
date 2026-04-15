package x1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import j2.h0;
import jc.l;
import org.xmlpull.v1.XmlPullParser;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f24543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24544b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1 f24545c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f24543a = xmlResourceParser;
        y1 y1Var = new y1(22, false);
        y1Var.f18634b = new float[64];
        this.f24545c = y1Var;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (o3.b.d(this.f24543a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f24544b = i10 | this.f24544b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f24543a, aVar.f24543a) && this.f24544b == aVar.f24544b;
    }

    public final int hashCode() {
        return (this.f24543a.hashCode() * 31) + this.f24544b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f24543a);
        sb.append(", config=");
        return h0.m(sb, this.f24544b, ')');
    }
}
