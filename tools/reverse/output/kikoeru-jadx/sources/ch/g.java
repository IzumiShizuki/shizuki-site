package ch;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d[] f4184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f4185b;

    static {
        d dVar = new d("", d.f4164i);
        lh.i iVar = d.f4161f;
        d dVar2 = new d("GET", iVar);
        d dVar3 = new d("POST", iVar);
        lh.i iVar2 = d.f4162g;
        d dVar4 = new d("/", iVar2);
        d dVar5 = new d("/index.html", iVar2);
        lh.i iVar3 = d.f4163h;
        d dVar6 = new d("http", iVar3);
        d dVar7 = new d("https", iVar3);
        lh.i iVar4 = d.f4160e;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d("200", iVar4), new d("204", iVar4), new d("206", iVar4), new d("304", iVar4), new d("400", iVar4), new d("404", iVar4), new d("500", iVar4), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f4184a = dVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(dVarArr[i10].f4165a)) {
                linkedHashMap.put(dVarArr[i10].f4165a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        jc.l.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        f4185b = mapUnmodifiableMap;
    }

    public static void a(lh.i iVar) throws IOException {
        jc.l.e(iVar, "name");
        int iD = iVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = iVar.i(i10);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.s()));
            }
        }
    }
}
