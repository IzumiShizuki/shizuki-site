.class Lapp/nekogram/translator/x;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field private final a:Ljava/lang/String;
    .annotation runtime Lfb/b;
        value = "fn"
    .end annotation
.end field

.field private final b:Ljava/lang/String;
    .annotation runtime Lfb/b;
        value = "session"
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation runtime Lfb/b;
        value = "client_key"
    .end annotation
.end field

.field private final d:Ljava/lang/String;
    .annotation runtime Lfb/b;
        value = "user"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x133cdf80aad6L

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    sget-object v2, Lapp/nekogram/translator/j0;->a:[Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lnh/a;->u(J[Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lapp/nekogram/translator/x;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-wide v0, -0x134ddf80aad6L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2}, Lnh/a;->u(J[Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lapp/nekogram/translator/x;->b:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-wide v3, -0x134edf80aad6L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4, v2}, Lnh/a;->u(J[Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    sget-object v1, Lapp/nekogram/translator/c0;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-wide v3, -0x136cdf80aad6L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v3, v4, v2}, Lnh/a;->u(J[Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    sget-wide v3, Lapp/nekogram/translator/c0;->c:J

    .line 63
    .line 64
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lapp/nekogram/translator/x;->c:Ljava/lang/String;

    .line 72
    .line 73
    const-wide v0, -0x136edf80aad6L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1, v2}, Lnh/a;->u(J[Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, Lapp/nekogram/translator/x;->d:Ljava/lang/String;

    .line 83
    .line 84
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method
