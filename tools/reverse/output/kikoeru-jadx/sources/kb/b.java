package kb;

import eb.a0;
import eb.m;
import eb.t;
import eb.z;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11318b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f11319a;

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public class a implements a0 {
        @Override // eb.a0
        public final z a(m mVar, lb.a aVar) {
            if (aVar.f12165a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public /* synthetic */ b(int i10) {
        this();
    }

    @Override // eb.z
    public final Object a(mb.a aVar) throws IOException {
        Time time;
        if (aVar.h0() == 9) {
            aVar.c0();
            return null;
        }
        String strF0 = aVar.f0();
        synchronized (this) {
            TimeZone timeZone = this.f11319a.getTimeZone();
            try {
                try {
                    time = new Time(this.f11319a.parse(strF0).getTime());
                } catch (ParseException e10) {
                    throw new t("Failed parsing '" + strF0 + "' as SQL Time; at path " + aVar.u(true), e10);
                }
            } finally {
                this.f11319a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // eb.z
    public final void b(mb.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.y();
            return;
        }
        synchronized (this) {
            str = this.f11319a.format((Date) time);
        }
        bVar.Y(str);
    }

    private b() {
        this.f11319a = new SimpleDateFormat("hh:mm:ss a");
    }
}
