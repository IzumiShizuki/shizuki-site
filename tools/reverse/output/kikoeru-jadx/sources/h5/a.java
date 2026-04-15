package h5;

import f6.h;
import gh.g;
import h6.c;
import j2.h0;
import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f8116a = new a();

    public final g a(q qVar) {
        String str = qVar.f14544n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new b6.b(0);
                case "application/x-icy":
                    return new e6.a();
                case "application/id3":
                    return new h(null);
                case "application/x-emsg":
                    return new b6.b(1);
                case "application/x-scte35":
                    return new c();
            }
        }
        throw new IllegalArgumentException(h0.x("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public final boolean b(q qVar) {
        String str = qVar.f14544n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
