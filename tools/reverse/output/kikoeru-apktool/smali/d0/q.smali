.class public final Ld0/q;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Ld0/d;

.field public final synthetic d:Lhf/y;


# direct methods
.method public constructor <init>(ZLd0/d;Lhf/y;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ld0/q;->b:Z

    .line 2
    .line 3
    iput-object p2, p0, Ld0/q;->c:Ld0/d;

    .line 4
    .line 5
    iput-object p3, p0, Ld0/q;->d:Lhf/y;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lq2/k;

    .line 2
    .line 3
    iget-boolean v0, p0, Ld0/q;->b:Z

    .line 4
    .line 5
    iget-object v1, p0, Ld0/q;->d:Lhf/y;

    .line 6
    .line 7
    iget-object v2, p0, Ld0/q;->c:Ld0/d;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ld0/p;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v4, v2, v1}, Ld0/p;-><init>(ILd0/d;Lhf/y;)V

    .line 16
    .line 17
    .line 18
    sget-object v4, Lq2/v;->a:[Lpc/u;

    .line 19
    .line 20
    sget-object v4, Lq2/j;->x:Lq2/w;

    .line 21
    .line 22
    new-instance v5, Lq2/a;

    .line 23
    .line 24
    invoke-direct {v5, v3, v0}, Lq2/a;-><init>(Ljava/lang/String;Lub/e;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v4, v5}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ld0/p;

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-direct {v0, v4, v2, v1}, Ld0/p;-><init>(ILd0/d;Lhf/y;)V

    .line 34
    .line 35
    .line 36
    sget-object v1, Lq2/j;->z:Lq2/w;

    .line 37
    .line 38
    new-instance v2, Lq2/a;

    .line 39
    .line 40
    invoke-direct {v2, v3, v0}, Lq2/a;-><init>(Ljava/lang/String;Lub/e;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1, v2}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ld0/p;

    .line 48
    .line 49
    const/4 v4, 0x2

    .line 50
    invoke-direct {v0, v4, v2, v1}, Ld0/p;-><init>(ILd0/d;Lhf/y;)V

    .line 51
    .line 52
    .line 53
    sget-object v4, Lq2/v;->a:[Lpc/u;

    .line 54
    .line 55
    sget-object v4, Lq2/j;->y:Lq2/w;

    .line 56
    .line 57
    new-instance v5, Lq2/a;

    .line 58
    .line 59
    invoke-direct {v5, v3, v0}, Lq2/a;-><init>(Ljava/lang/String;Lub/e;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v4, v5}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Ld0/p;

    .line 66
    .line 67
    const/4 v4, 0x3

    .line 68
    invoke-direct {v0, v4, v2, v1}, Ld0/p;-><init>(ILd0/d;Lhf/y;)V

    .line 69
    .line 70
    .line 71
    sget-object v1, Lq2/j;->A:Lq2/w;

    .line 72
    .line 73
    new-instance v2, Lq2/a;

    .line 74
    .line 75
    invoke-direct {v2, v3, v0}, Lq2/a;-><init>(Ljava/lang/String;Lub/e;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1, v2}, Lq2/k;->l(Lq2/w;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 82
    .line 83
    return-object p1
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
