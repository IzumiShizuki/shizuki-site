package tc;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f20644a = new e();

    @Override // ic.k
    public final Object a(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        jc.l.e(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            jc.l.d(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            jc.l.d(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
