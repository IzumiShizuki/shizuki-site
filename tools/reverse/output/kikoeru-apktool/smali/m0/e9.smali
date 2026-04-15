.class public abstract Lm0/e9;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lt2/l0;

.field public static final b:Lx0/o2;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    new-instance v0, Le3/i;

    .line 2
    .line 3
    sget v1, Le3/f;->b:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Le3/i;-><init>(FI)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lt2/l0;->d:Lt2/l0;

    .line 10
    .line 11
    sget-object v15, Lm0/t1;->a:Lt2/w;

    .line 12
    .line 13
    const v17, 0xe7ffff

    .line 14
    .line 15
    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const-wide/16 v13, 0x0

    .line 28
    .line 29
    move-object/from16 v16, v0

    .line 30
    .line 31
    invoke-static/range {v1 .. v17}, Lt2/l0;->a(Lt2/l0;JJLx2/k;Lx2/i;Lx2/n;JLq1/k0;Ls1/h;JLt2/w;Le3/i;I)Lt2/l0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lm0/e9;->a:Lt2/l0;

    .line 36
    .line 37
    new-instance v0, Li9/f;

    .line 38
    .line 39
    const/16 v1, 0x11

    .line 40
    .line 41
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lx0/o2;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lx0/m1;-><init>(Lic/a;)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Lm0/e9;->b:Lx0/o2;

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

.method public static final a(Lt2/l0;)Lt2/l0;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lt2/l0;->a:Lt2/d0;

    .line 4
    .line 5
    iget-object v0, v0, Lt2/d0;->f:Lx2/n;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    const/16 v16, 0x0

    .line 11
    .line 12
    const v17, 0xffffdf

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    sget-object v8, Lx2/n;->a:Lx2/b;

    .line 22
    .line 23
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const-wide/16 v13, 0x0

    .line 28
    .line 29
    const/4 v15, 0x0

    .line 30
    invoke-static/range {v1 .. v17}, Lt2/l0;->a(Lt2/l0;JJLx2/k;Lx2/i;Lx2/n;JLq1/k0;Ls1/h;JLt2/w;Le3/i;I)Lt2/l0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
    .line 35
    .line 36
.end method
