package j9;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f10699a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ef.l f10700b = new ef.l("\\[(\\d{2,}):(\\d{2})\\.(\\d{2,3})](.*)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ef.l f10701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ef.l f10702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ef.l f10703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ef.l f10704f;

    static {
        int i10 = 0;
        Iterator it = vb.l.N0(new ef.m[]{ef.m.f6577b, ef.m.f6578c}).iterator();
        while (it.hasNext()) {
            i10 |= ((ef.m) it.next()).f6580a;
        }
        if ((i10 & 2) != 0) {
            i10 |= 64;
        }
        Pattern patternCompile = Pattern.compile(".*(?:(?:(\\d{2}):)?(\\d{2}):(\\d{2})[.,](\\d{3}) --> (?:(\\d{2}):)?(\\d{2}):(\\d{2})[.,](\\d{3}))\r?\n(.*?)", i10);
        jc.l.d(patternCompile, "compile(...)");
        f10701c = new ef.l(patternCompile);
        f10702d = new ef.l("(?:\\d{2}:)?\\d{2}:\\d{2}[.,]\\d{3} --> (?:(\\d{2}):)?(\\d{2}):(\\d{2})[.,](\\d{3})");
        f10703e = new ef.l("(\\d):(\\d{2}):(\\d{2})\\.(\\d{2})");
        f10704f = new ef.l("\\{.+?\\}");
    }

    public static int a(long j10, List list) {
        jc.l.e(list, "<this>");
        if (list.isEmpty()) {
            return -1;
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (((f0) it.next()).f10694a > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return ud.b.r(list);
        }
        if (i10 != 0) {
            return i10 - 1;
        }
        return 0;
    }
}
