.class public abstract Ls/c1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ls/k;->f:Ls/k;

    .line 2
    .line 3
    new-instance v1, Lx0/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lx0/z;-><init>(Lic/k;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Ls/c1;->a:Lx0/z;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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
.end method

.method public static final a(Lx0/o;)Ls/f;
    .locals 10

    .line 1
    const v0, 0x10dd5ab0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lx0/o;->W(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Ls/c1;->a:Lx0/z;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ls/g;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lx0/o;->p(Z)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p0, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p0}, Lx0/o;->K()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    sget-object v2, Lx0/k;->a:Lx0/r0;

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    :cond_1
    new-instance v4, Ls/f;

    .line 38
    .line 39
    iget-object v5, v0, Ls/g;->a:Landroid/content/Context;

    .line 40
    .line 41
    iget-object v6, v0, Ls/g;->b:Lf3/c;

    .line 42
    .line 43
    iget-wide v7, v0, Ls/g;->c:J

    .line 44
    .line 45
    iget-object v9, v0, Ls/g;->d:Ly/d1;

    .line 46
    .line 47
    invoke-direct/range {v4 .. v9}, Ls/f;-><init>(Landroid/content/Context;Lf3/c;JLy/d1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v3, v4

    .line 54
    :cond_2
    check-cast v3, Ls/f;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lx0/o;->p(Z)V

    .line 57
    .line 58
    .line 59
    return-object v3
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
