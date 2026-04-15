.class public final Lt9/g;
.super Landroidx/lifecycle/s0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final b:Lwb/e;


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwb/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lwb/e;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lt9/a;->values()[Lt9/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    array-length v3, v1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    array-length v3, v1

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    :goto_0
    if-ge v5, v3, :cond_0

    .line 23
    .line 24
    aget-object v6, v1, v5

    .line 25
    .line 26
    new-instance v7, Li7/j1;

    .line 27
    .line 28
    const/16 v8, 0x19

    .line 29
    .line 30
    invoke-direct {v7, v8}, Li7/j1;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    new-instance v9, Lt9/f;

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    invoke-direct {v9, v10, v6}, Lt9/f;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v10, Li7/o0;

    .line 44
    .line 45
    new-instance v11, Li7/i1;

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    invoke-direct {v11, v12, v9, v13}, Li7/i1;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v10, v11, v8, v7}, Li7/o0;-><init>(Li7/i1;Ljava/lang/Integer;Li7/j1;)V

    .line 53
    .line 54
    .line 55
    iget-object v7, v10, Li7/o0;->f:Llf/f;

    .line 56
    .line 57
    invoke-static {p0}, Landroidx/lifecycle/m0;->h(Landroidx/lifecycle/s0;)Lk4/a;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-static {v7, v8}, Li7/u;->a(Llf/f;Lk4/a;)Llf/j0;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v0, v6, v7}, Lwb/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    sget-object v6, Lub/a0;->a:Lub/a0;

    .line 69
    .line 70
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    add-int/lit8 v5, v5, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v0}, Lwb/e;->b()Lwb/e;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Lt9/g;->b:Lwb/e;

    .line 81
    .line 82
    return-void
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
