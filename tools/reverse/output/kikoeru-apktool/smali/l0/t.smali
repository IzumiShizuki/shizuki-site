.class public final Ll0/t;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ll0/h;


# static fields
.field public static final b:Ll0/t;

.field public static final c:Ll0/t;

.field public static final d:Ll0/s;

.field public static final e:Ll0/s;

.field public static final f:Ll0/s;

.field public static final g:Ll0/s;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll0/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll0/t;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll0/t;->b:Ll0/t;

    .line 8
    .line 9
    new-instance v0, Ll0/t;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Ll0/t;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ll0/t;->c:Ll0/t;

    .line 16
    .line 17
    new-instance v0, Ll0/s;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, v1}, Ll0/s;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ll0/t;->d:Ll0/s;

    .line 24
    .line 25
    new-instance v0, Ll0/s;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, v1}, Ll0/s;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ll0/t;->e:Ll0/s;

    .line 32
    .line 33
    new-instance v0, Ll0/s;

    .line 34
    .line 35
    const/4 v1, 0x2

    .line 36
    invoke-direct {v0, v1}, Ll0/s;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ll0/t;->f:Ll0/s;

    .line 40
    .line 41
    new-instance v0, Ll0/s;

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    invoke-direct {v0, v1}, Ll0/s;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Ll0/t;->g:Ll0/s;

    .line 48
    .line 49
    return-void
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

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ll0/t;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public a(Ll0/p;I)J
    .locals 1

    .line 1
    iget v0, p0, Ll0/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Ll0/p;->f:Lt2/i0;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lt2/i0;->j(I)J

    .line 9
    .line 10
    .line 11
    move-result-wide p1

    .line 12
    return-wide p1

    .line 13
    :pswitch_0
    iget-object p1, p1, Ll0/p;->f:Lt2/i0;

    .line 14
    .line 15
    iget-object p1, p1, Lt2/i0;->a:Lt2/h0;

    .line 16
    .line 17
    iget-object p1, p1, Lt2/h0;->a:Lt2/g;

    .line 18
    .line 19
    iget-object p1, p1, Lt2/g;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, p2}, Lh0/q0;->q(Ljava/lang/CharSequence;I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p1, p2}, Lh0/q0;->p(Ljava/lang/CharSequence;I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {v0, p1}, Lt2/c0;->b(II)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
