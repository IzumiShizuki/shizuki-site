.class public final Lo1/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lo1/k;

.field public final b:Lj2/v;

.field public final c:Lo/l0;

.field public final d:Lo/l0;

.field public e:Z


# direct methods
.method public constructor <init>(Lo1/k;Lj2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo1/g;->a:Lo1/k;

    .line 5
    .line 6
    iput-object p2, p0, Lo1/g;->b:Lj2/v;

    .line 7
    .line 8
    sget p1, Lo/t0;->a:I

    .line 9
    .line 10
    new-instance p1, Lo/l0;

    .line 11
    .line 12
    invoke-direct {p1}, Lo/l0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lo1/g;->c:Lo/l0;

    .line 16
    .line 17
    new-instance p1, Lo/l0;

    .line 18
    .line 19
    invoke-direct {p1}, Lo/l0;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lo1/g;->d:Lo/l0;

    .line 23
    .line 24
    return-void
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
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
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
.end method


# virtual methods
.method public final a()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lo1/g;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v1, Ld/i0;

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    const/16 v9, 0x9

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-class v4, Lo1/g;

    .line 12
    .line 13
    const-string v5, "invalidateNodes"

    .line 14
    .line 15
    const-string v6, "invalidateNodes()V"

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    move-object v3, p0

    .line 19
    invoke-direct/range {v1 .. v9}, Ld/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v3, Lo1/g;->b:Lj2/v;

    .line 23
    .line 24
    iget-object v0, v0, Lj2/v;->N0:Lo/g0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lo/g0;->f(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ltz v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0, v1}, Lo/g0;->a(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, v3, Lo1/g;->e:Z

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    move-object v3, p0

    .line 41
    return-void
    .line 42
    .line 43
    .line 44
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
