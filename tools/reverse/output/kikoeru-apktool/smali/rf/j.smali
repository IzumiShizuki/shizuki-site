.class public abstract Lrf/j;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:I

.field public static final b:Lapp/nekogram/translator/r;

.field public static final c:Lapp/nekogram/translator/r;

.field public static final d:Lapp/nekogram/translator/r;

.field public static final e:Lapp/nekogram/translator/r;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const-string v2, "kotlinx.coroutines.semaphore.maxSpinCycles"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lnf/b;->l(IILjava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sput v0, Lrf/j;->a:I

    .line 12
    .line 13
    new-instance v0, Lapp/nekogram/translator/r;

    .line 14
    .line 15
    const-string v2, "PERMIT"

    .line 16
    .line 17
    const/4 v3, 0x7

    .line 18
    invoke-direct {v0, v3, v2}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lrf/j;->b:Lapp/nekogram/translator/r;

    .line 22
    .line 23
    new-instance v0, Lapp/nekogram/translator/r;

    .line 24
    .line 25
    const-string v2, "TAKEN"

    .line 26
    .line 27
    invoke-direct {v0, v3, v2}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lrf/j;->c:Lapp/nekogram/translator/r;

    .line 31
    .line 32
    new-instance v0, Lapp/nekogram/translator/r;

    .line 33
    .line 34
    const-string v2, "BROKEN"

    .line 35
    .line 36
    invoke-direct {v0, v3, v2}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lrf/j;->d:Lapp/nekogram/translator/r;

    .line 40
    .line 41
    new-instance v0, Lapp/nekogram/translator/r;

    .line 42
    .line 43
    const-string v2, "CANCELLED"

    .line 44
    .line 45
    invoke-direct {v0, v3, v2}, Lapp/nekogram/translator/r;-><init>(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lrf/j;->e:Lapp/nekogram/translator/r;

    .line 49
    .line 50
    const-string v0, "kotlinx.coroutines.semaphore.segmentSize"

    .line 51
    .line 52
    const/16 v2, 0x10

    .line 53
    .line 54
    invoke-static {v2, v1, v0}, Lnf/b;->l(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sput v0, Lrf/j;->f:I

    .line 59
    .line 60
    return-void
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
