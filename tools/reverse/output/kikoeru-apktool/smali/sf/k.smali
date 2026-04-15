.class public abstract Lsf/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lwf/j1;

.field public static final b:Lwf/j1;

.field public static final c:Lv2/e;

.field public static final d:Lv2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lm0/l3;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lm0/l3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-boolean v1, Lwf/m;->a:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v2, Lv2/e;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Lv2/e;-><init>(Lic/k;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v2, Lsc/e;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v2, v0, v3}, Lsc/e;-><init>(Lic/k;I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sput-object v2, Lsf/k;->a:Lwf/j1;

    .line 25
    .line 26
    new-instance v0, Lsf/i;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, v2}, Lsf/i;-><init>(I)V

    .line 30
    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    new-instance v2, Lv2/e;

    .line 35
    .line 36
    invoke-direct {v2, v0}, Lv2/e;-><init>(Lic/k;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance v2, Lsc/e;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-direct {v2, v0, v3}, Lsc/e;-><init>(Lic/k;I)V

    .line 44
    .line 45
    .line 46
    :goto_1
    sput-object v2, Lsf/k;->b:Lwf/j1;

    .line 47
    .line 48
    new-instance v0, Lq9/b;

    .line 49
    .line 50
    const/16 v2, 0x11

    .line 51
    .line 52
    invoke-direct {v0, v2}, Lq9/b;-><init>(I)V

    .line 53
    .line 54
    .line 55
    new-instance v2, Lv2/e;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const/4 v3, 0x5

    .line 60
    invoke-direct {v2, v3, v0}, Lv2/e;-><init>(ILic/n;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const/4 v3, 0x6

    .line 65
    invoke-direct {v2, v3, v0}, Lv2/e;-><init>(ILic/n;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    sput-object v2, Lsf/k;->c:Lv2/e;

    .line 69
    .line 70
    new-instance v0, Lq9/b;

    .line 71
    .line 72
    const/16 v2, 0x12

    .line 73
    .line 74
    invoke-direct {v0, v2}, Lq9/b;-><init>(I)V

    .line 75
    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    new-instance v1, Lv2/e;

    .line 80
    .line 81
    const/4 v2, 0x5

    .line 82
    invoke-direct {v1, v2, v0}, Lv2/e;-><init>(ILic/n;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    new-instance v1, Lv2/e;

    .line 87
    .line 88
    const/4 v2, 0x6

    .line 89
    invoke-direct {v1, v2, v0}, Lv2/e;-><init>(ILic/n;)V

    .line 90
    .line 91
    .line 92
    :goto_3
    sput-object v1, Lsf/k;->d:Lv2/e;

    .line 93
    .line 94
    return-void
    .line 95
    .line 96
    .line 97
    .line 98
.end method
