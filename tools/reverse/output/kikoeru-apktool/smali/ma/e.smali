.class public final Lma/e;
.super Landroidx/lifecycle/s0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final b:Lx0/e1;

.field public final c:Lx0/e1;

.field public final d:Lx0/e1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh9/d;->a:Lx0/e1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lbg/a2;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v1, Lbg/a2;->m:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v2

    .line 19
    :goto_0
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, p0, Lma/e;->b:Lx0/e1;

    .line 24
    .line 25
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lbg/a2;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object v1, v1, Lbg/a2;->w:Ljava/lang/Integer;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v1, v2

    .line 37
    :goto_1
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p0, Lma/e;->c:Lx0/e1;

    .line 42
    .line 43
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lbg/a2;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v2, v0, Lbg/a2;->t:Ljava/lang/String;

    .line 52
    .line 53
    :cond_2
    if-nez v2, :cond_3

    .line 54
    .line 55
    const-string v2, ""

    .line 56
    .line 57
    :cond_3
    invoke-static {v2}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Lma/e;->d:Lx0/e1;

    .line 62
    .line 63
    return-void
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
