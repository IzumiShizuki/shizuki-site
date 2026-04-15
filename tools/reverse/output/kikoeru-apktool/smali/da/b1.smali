.class public final Lda/b1;
.super Landroidx/lifecycle/s0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final b:Lx0/e1;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li7/j1;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Li7/j1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La9/g;

    .line 12
    .line 13
    const/16 v2, 0x1c

    .line 14
    .line 15
    invoke-direct {v1, v2}, La9/g;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Li7/o0;

    .line 24
    .line 25
    new-instance v4, Li7/i1;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-direct {v4, v5, v1, v6}, Li7/i1;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v3, v4, v2, v0}, Li7/o0;-><init>(Li7/i1;Ljava/lang/Integer;Li7/j1;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v3, Li7/o0;->f:Llf/f;

    .line 36
    .line 37
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Li7/u;->a(Llf/f;Lk4/a;)Llf/j0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lda/b1;->b:Lx0/e1;

    .line 50
    .line 51
    return-void
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


# virtual methods
.method public final w(JZ)V
    .locals 4

    .line 1
    new-instance v0, Li7/j1;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li7/j1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lda/a1;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2, p3}, Lda/a1;-><init>(JZ)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance p2, Li7/o0;

    .line 19
    .line 20
    new-instance p3, Li7/i1;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {p3, v2, v1, v3}, Li7/i1;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p2, p3, p1, v0}, Li7/o0;-><init>(Li7/i1;Ljava/lang/Integer;Li7/j1;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p2, Li7/o0;->f:Llf/f;

    .line 35
    .line 36
    invoke-static {p2, p1}, Li7/u;->a(Llf/f;Lk4/a;)Llf/j0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p2, p0, Lda/b1;->b:Lx0/e1;

    .line 41
    .line 42
    invoke-virtual {p2, p1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
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
