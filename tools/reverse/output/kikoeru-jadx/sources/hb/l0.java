package hb;

import java.io.IOException;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l0 extends eb.z {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @Override // eb.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mb.a r13) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r13.h0()
            r1 = 9
            if (r0 != r1) goto Ld
            r13.c0()
            r13 = 0
            return r13
        Ld:
            r13.g()
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L17:
            int r1 = r13.h0()
            r8 = 4
            if (r1 == r8) goto L82
            java.lang.String r1 = r13.X()
            int r9 = r13.O()
            r1.getClass()
            int r10 = r1.hashCode()
            r11 = -1
            switch(r10) {
                case -1181204563: goto L68;
                case -1074026988: goto L5d;
                case -906279820: goto L52;
                case 3704893: goto L47;
                case 104080000: goto L3e;
                case 985252545: goto L33;
                default: goto L31;
            }
        L31:
            r8 = -1
            goto L72
        L33:
            java.lang.String r8 = "hourOfDay"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3c
            goto L31
        L3c:
            r8 = 5
            goto L72
        L3e:
            java.lang.String r10 = "month"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L72
            goto L31
        L47:
            java.lang.String r8 = "year"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L50
            goto L31
        L50:
            r8 = 3
            goto L72
        L52:
            java.lang.String r8 = "second"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L5b
            goto L31
        L5b:
            r8 = 2
            goto L72
        L5d:
            java.lang.String r8 = "minute"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L66
            goto L31
        L66:
            r8 = 1
            goto L72
        L68:
            java.lang.String r8 = "dayOfMonth"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L71
            goto L31
        L71:
            r8 = 0
        L72:
            switch(r8) {
                case 0: goto L80;
                case 1: goto L7e;
                case 2: goto L7c;
                case 3: goto L7a;
                case 4: goto L78;
                case 5: goto L76;
                default: goto L75;
            }
        L75:
            goto L17
        L76:
            r5 = r9
            goto L17
        L78:
            r3 = r9
            goto L17
        L7a:
            r2 = r9
            goto L17
        L7c:
            r7 = r9
            goto L17
        L7e:
            r6 = r9
            goto L17
        L80:
            r4 = r9
            goto L17
        L82:
            r13.o()
            java.util.GregorianCalendar r1 = new java.util.GregorianCalendar
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.l0.a(mb.a):java.lang.Object");
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            bVar.y();
            return;
        }
        bVar.i();
        bVar.q("year");
        bVar.R(r4.get(1));
        bVar.q("month");
        bVar.R(r4.get(2));
        bVar.q("dayOfMonth");
        bVar.R(r4.get(5));
        bVar.q("hourOfDay");
        bVar.R(r4.get(11));
        bVar.q("minute");
        bVar.R(r4.get(12));
        bVar.q("second");
        bVar.R(r4.get(13));
        bVar.o();
    }
}
