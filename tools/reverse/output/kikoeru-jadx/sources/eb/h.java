package eb;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f6448b;

    static {
        a aVar = new a();
        f6447a = aVar;
        f6448b = new h[]{aVar, new h() { // from class: eb.b
            @Override // eb.h
            public final String b(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: eb.c
            @Override // eb.h
            public final String b(Field field) {
                return h.c(h.a(' ', field.getName()));
            }
        }, new h() { // from class: eb.d
            @Override // eb.h
            public final String b(Field field) {
                return h.a('_', field.getName()).toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: eb.e
            @Override // eb.h
            public final String b(Field field) {
                return h.a('_', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: eb.f
            @Override // eb.h
            public final String b(Field field) {
                return h.a('-', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: eb.g
            @Override // eb.h
            public final String b(Field field) {
                return h.a('.', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(char c3, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c3);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (!Character.isLetter(cCharAt)) {
                i10++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f6448b.clone();
    }

    public abstract String b(Field field);
}
