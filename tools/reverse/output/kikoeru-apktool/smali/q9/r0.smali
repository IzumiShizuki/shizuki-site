.class public final Lq9/r0;
.super Landroidx/lifecycle/s0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final g:Lm3/l;


# instance fields
.field public final b:Lm0/t2;

.field public final c:Lx0/e1;

.field public final d:Lx0/e1;

.field public final e:Lx0/e1;

.field public final f:Lx0/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm3/l;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lm3/l;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lq9/r0;->g:Lm3/l;

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

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm0/t2;

    .line 5
    .line 6
    new-instance v1, Lg1/d;

    .line 7
    .line 8
    const/16 v2, 0x1c

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lg1/d;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lm0/u2;->a:Lm0/u2;

    .line 14
    .line 15
    invoke-direct {v0, v2, v1}, Lm0/t2;-><init>(Lm0/u2;Lic/k;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lq9/r0;->b:Lm0/t2;

    .line 19
    .line 20
    new-instance v0, Li7/j1;

    .line 21
    .line 22
    const/16 v1, 0x14

    .line 23
    .line 24
    invoke-direct {v0, v1}, Li7/j1;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lq9/j0;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v1, v2}, Lq9/j0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Li7/o0;

    .line 38
    .line 39
    new-instance v4, Li7/i1;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-direct {v4, v5, v1, v6}, Li7/i1;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v4, v2, v0}, Li7/o0;-><init>(Li7/i1;Ljava/lang/Integer;Li7/j1;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v3, Li7/o0;->f:Llf/f;

    .line 50
    .line 51
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v0, v1}, Li7/u;->a(Llf/f;Lk4/a;)Llf/j0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, Lq9/r0;->c:Lx0/e1;

    .line 64
    .line 65
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p0, Lq9/r0;->d:Lx0/e1;

    .line 72
    .line 73
    invoke-static {v0}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lq9/r0;->e:Lx0/e1;

    .line 78
    .line 79
    invoke-static {v6}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lq9/r0;->f:Lx0/e1;

    .line 84
    .line 85
    return-void
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
.method public final w()Lbg/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/r0;->f:Lx0/e1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lbg/p;

    .line 8
    .line 9
    return-object v0
    .line 10
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

.method public final x()V
    .locals 7

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
    new-instance v1, Lq9/j0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v2}, Lq9/j0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Li7/o0;

    .line 20
    .line 21
    new-instance v4, Li7/i1;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-direct {v4, v5, v1, v6}, Li7/i1;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v4, v2, v0}, Li7/o0;-><init>(Li7/i1;Ljava/lang/Integer;Li7/j1;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, v3, Li7/o0;->f:Llf/f;

    .line 36
    .line 37
    invoke-static {v1, v0}, Li7/u;->a(Llf/f;Lk4/a;)Llf/j0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lq9/r0;->c:Lx0/e1;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
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
