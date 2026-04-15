.class public final Lx4/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lx4/b;

.field public c:Ltc/b0;

.field public d:Z

.field public final e:Lx4/w;

.field public final f:Lx4/w;

.field public g:Lv2/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx4/p;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget-object p1, Lx4/b;->c:Lx4/b;

    .line 7
    .line 8
    iput-object p1, p0, Lx4/p;->b:Lx4/b;

    .line 9
    .line 10
    sget-object p1, Lx4/w;->a:Lx4/w;

    .line 11
    .line 12
    iput-object p1, p0, Lx4/p;->e:Lx4/w;

    .line 13
    .line 14
    sget-object p1, Lx4/w;->b:Lx4/w;

    .line 15
    .line 16
    iput-object p1, p0, Lx4/p;->f:Lx4/w;

    .line 17
    .line 18
    return-void
    .line 19
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final a()Lx4/v;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lx4/p;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lx4/p;->d:Z

    .line 9
    .line 10
    iget-object v0, p0, Lx4/p;->c:Ltc/b0;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Ltc/b0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    new-array v1, v1, [Ln4/f;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ltc/b0;-><init>([Ln4/f;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lx4/p;->c:Ltc/b0;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lx4/p;->g:Lv2/e;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Lv2/e;

    .line 29
    .line 30
    iget-object v1, p0, Lx4/p;->a:Landroid/content/Context;

    .line 31
    .line 32
    const/16 v2, 0x9

    .line 33
    .line 34
    invoke-direct {v0, v2, v1}, Lv2/e;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lx4/p;->g:Lv2/e;

    .line 38
    .line 39
    :cond_1
    new-instance v0, Lx4/v;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Lx4/v;-><init>(Lx4/p;)V

    .line 42
    .line 43
    .line 44
    return-object v0
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
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
