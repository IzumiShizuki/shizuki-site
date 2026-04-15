.class public abstract Lv0/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/o2;

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lv0/b;->f:Lv0/b;

    .line 2
    .line 3
    new-instance v1, Lx0/o2;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lx0/m1;-><init>(Lic/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lv0/k;->a:Lx0/o2;

    .line 9
    .line 10
    const/16 v0, 0x30

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0, v0}, La2/c;->e(FF)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lv0/k;->b:J

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
