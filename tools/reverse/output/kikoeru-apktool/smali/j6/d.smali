.class public final Lj6/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/n;


# static fields
.field public static final f0:[B

.field public static final g0:[B

.field public static final h0:[B

.field public static final i0:[B

.field public static final j0:Ljava/util/UUID;

.field public static final k0:Ljava/util/Map;


# instance fields
.field public A:J

.field public B:Z

.field public C:J

.field public D:J

.field public E:J

.field public F:Ld2/b;

.field public G:Ld2/b;

.field public H:Z

.field public I:Z

.field public J:I

.field public K:J

.field public L:J

.field public M:I

.field public N:I

.field public O:[I

.field public P:I

.field public Q:I

.field public R:I

.field public S:I

.field public T:Z

.field public U:J

.field public V:I

.field public W:I

.field public X:I

.field public Y:Z

.field public Z:Z

.field public final a:Lj6/b;

.field public a0:Z

.field public final b:Lj6/e;

.field public b0:I

.field public final c:Landroid/util/SparseArray;

.field public c0:B

.field public final d:Z

.field public d0:Z

.field public final e:Z

.field public e0:Lr5/q;

.field public final f:Lo6/j;

.field public final g:Lp4/s;

.field public final h:Lp4/s;

.field public final i:Lp4/s;

.field public final j:Lp4/s;

.field public final k:Lp4/s;

.field public final l:Lp4/s;

.field public final m:Lp4/s;

.field public final n:Lp4/s;

.field public final o:Lp4/s;

.field public final p:Lp4/s;

.field public q:Ljava/nio/ByteBuffer;

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:J

.field public w:Z

.field public x:Lj6/c;

.field public y:Z

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lj6/d;->f0:[B

    .line 9
    .line 10
    sget v1, Lp4/c0;->a:I

    .line 11
    .line 12
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Lj6/d;->g0:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, Lj6/d;->h0:[B

    .line 28
    .line 29
    const/16 v0, 0x26

    .line 30
    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    .line 36
    sput-object v0, Lj6/d;->i0:[B

    .line 37
    .line 38
    new-instance v0, Ljava/util/UUID;

    .line 39
    .line 40
    const-wide v1, 0x100000000001000L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lj6/d;->j0:Ljava/util/UUID;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v1, "htc_video_rotA-090"

    .line 61
    .line 62
    const/16 v2, 0x5a

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    const-string v4, "htc_video_rotA-000"

    .line 66
    .line 67
    invoke-static {v3, v0, v4, v2, v1}, Lj2/h0;->r(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, "htc_video_rotA-270"

    .line 71
    .line 72
    const/16 v2, 0x10e

    .line 73
    .line 74
    const/16 v3, 0xb4

    .line 75
    .line 76
    const-string v4, "htc_video_rotA-180"

    .line 77
    .line 78
    invoke-static {v3, v0, v4, v2, v1}, Lj2/h0;->r(ILjava/util/HashMap;Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sput-object v0, Lj6/d;->k0:Ljava/util/Map;

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>(Lo6/j;I)V
    .locals 5

    .line 1
    new-instance v0, Lj6/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lj6/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    iput-wide v1, p0, Lj6/d;->s:J

    .line 12
    .line 13
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v3, p0, Lj6/d;->t:J

    .line 19
    .line 20
    iput-wide v3, p0, Lj6/d;->u:J

    .line 21
    .line 22
    iput-wide v3, p0, Lj6/d;->v:J

    .line 23
    .line 24
    iput-wide v1, p0, Lj6/d;->C:J

    .line 25
    .line 26
    iput-wide v1, p0, Lj6/d;->D:J

    .line 27
    .line 28
    iput-wide v3, p0, Lj6/d;->E:J

    .line 29
    .line 30
    iput-object v0, p0, Lj6/d;->a:Lj6/b;

    .line 31
    .line 32
    new-instance v1, Li7/p2;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Li7/p2;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, v0, Lj6/b;->d:Li7/p2;

    .line 38
    .line 39
    iput-object p1, p0, Lj6/d;->f:Lo6/j;

    .line 40
    .line 41
    and-int/lit8 p1, p2, 0x1

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    const/4 v1, 0x1

    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 p1, 0x0

    .line 50
    :goto_0
    iput-boolean p1, p0, Lj6/d;->d:Z

    .line 51
    .line 52
    and-int/lit8 p1, p2, 0x2

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    :cond_1
    iput-boolean v0, p0, Lj6/d;->e:Z

    .line 58
    .line 59
    new-instance p1, Lj6/e;

    .line 60
    .line 61
    invoke-direct {p1}, Lj6/e;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lj6/d;->b:Lj6/e;

    .line 65
    .line 66
    new-instance p1, Landroid/util/SparseArray;

    .line 67
    .line 68
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lj6/d;->c:Landroid/util/SparseArray;

    .line 72
    .line 73
    new-instance p1, Lp4/s;

    .line 74
    .line 75
    const/4 p2, 0x4

    .line 76
    invoke-direct {p1, p2}, Lp4/s;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lj6/d;->i:Lp4/s;

    .line 80
    .line 81
    new-instance p1, Lp4/s;

    .line 82
    .line 83
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const/4 v2, -0x1

    .line 88
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {p1, v0}, Lp4/s;-><init>([B)V

    .line 97
    .line 98
    .line 99
    iput-object p1, p0, Lj6/d;->j:Lp4/s;

    .line 100
    .line 101
    new-instance p1, Lp4/s;

    .line 102
    .line 103
    invoke-direct {p1, p2}, Lp4/s;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lj6/d;->k:Lp4/s;

    .line 107
    .line 108
    new-instance p1, Lp4/s;

    .line 109
    .line 110
    sget-object v0, Lq4/p;->a:[B

    .line 111
    .line 112
    invoke-direct {p1, v0}, Lp4/s;-><init>([B)V

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, Lj6/d;->g:Lp4/s;

    .line 116
    .line 117
    new-instance p1, Lp4/s;

    .line 118
    .line 119
    invoke-direct {p1, p2}, Lp4/s;-><init>(I)V

    .line 120
    .line 121
    .line 122
    iput-object p1, p0, Lj6/d;->h:Lp4/s;

    .line 123
    .line 124
    new-instance p1, Lp4/s;

    .line 125
    .line 126
    invoke-direct {p1}, Lp4/s;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lj6/d;->l:Lp4/s;

    .line 130
    .line 131
    new-instance p1, Lp4/s;

    .line 132
    .line 133
    invoke-direct {p1}, Lp4/s;-><init>()V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Lj6/d;->m:Lp4/s;

    .line 137
    .line 138
    new-instance p1, Lp4/s;

    .line 139
    .line 140
    const/16 p2, 0x8

    .line 141
    .line 142
    invoke-direct {p1, p2}, Lp4/s;-><init>(I)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lj6/d;->n:Lp4/s;

    .line 146
    .line 147
    new-instance p1, Lp4/s;

    .line 148
    .line 149
    invoke-direct {p1}, Lp4/s;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object p1, p0, Lj6/d;->o:Lp4/s;

    .line 153
    .line 154
    new-instance p1, Lp4/s;

    .line 155
    .line 156
    invoke-direct {p1}, Lp4/s;-><init>()V

    .line 157
    .line 158
    .line 159
    iput-object p1, p0, Lj6/d;->p:Lp4/s;

    .line 160
    .line 161
    new-array p1, v1, [I

    .line 162
    .line 163
    iput-object p1, p0, Lj6/d;->O:[I

    .line 164
    .line 165
    return-void
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public static k(JJLjava/lang/String;)[B
    .locals 10

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    cmp-long v4, p0, v0

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {v0}, Lp4/c;->c(Z)V

    .line 16
    .line 17
    .line 18
    const-wide v0, 0xd693a400L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    div-long v4, p0, v0

    .line 24
    .line 25
    long-to-int v5, v4

    .line 26
    int-to-long v6, v5

    .line 27
    mul-long v6, v6, v0

    .line 28
    .line 29
    sub-long/2addr p0, v6

    .line 30
    const-wide/32 v0, 0x3938700

    .line 31
    .line 32
    .line 33
    div-long v6, p0, v0

    .line 34
    .line 35
    long-to-int v4, v6

    .line 36
    int-to-long v6, v4

    .line 37
    mul-long v6, v6, v0

    .line 38
    .line 39
    sub-long/2addr p0, v6

    .line 40
    const-wide/32 v0, 0xf4240

    .line 41
    .line 42
    .line 43
    div-long v6, p0, v0

    .line 44
    .line 45
    long-to-int v7, v6

    .line 46
    int-to-long v8, v7

    .line 47
    mul-long v8, v8, v0

    .line 48
    .line 49
    sub-long/2addr p0, v8

    .line 50
    div-long/2addr p0, p2

    .line 51
    long-to-int p1, p0

    .line 52
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 53
    .line 54
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 v1, 0x4

    .line 71
    new-array v1, v1, [Ljava/lang/Object;

    .line 72
    .line 73
    aput-object p2, v1, v2

    .line 74
    .line 75
    aput-object p3, v1, v3

    .line 76
    .line 77
    const/4 p2, 0x2

    .line 78
    aput-object v0, v1, p2

    .line 79
    .line 80
    const/4 p2, 0x3

    .line 81
    aput-object p1, v1, p2

    .line 82
    .line 83
    invoke-static {p0, p4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    sget p1, Lp4/c0;->a:I

    .line 88
    .line 89
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
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
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public final b(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj6/d;->F:Ld2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lj6/d;->G:Ld2/b;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Element "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, " must be in a Cues"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {v0, p1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1
    .line 35
    .line 36
.end method

.method public final c()Lr5/n;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj6/d;->x:Lj6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "Element "

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, " must be in a TrackEntry"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-static {v0, p1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final e(Lj6/c;JIII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lj6/c;->V:Lr5/i0;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    iget-object v2, v1, Lj6/c;->Z:Lr5/h0;

    .line 12
    .line 13
    iget-object v8, v1, Lj6/c;->k:Lr5/g0;

    .line 14
    .line 15
    move/from16 v5, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    move/from16 v7, p6

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    move-wide/from16 v3, p2

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v8}, Lr5/i0;->b(Lr5/h0;JIIILr5/g0;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Lj6/c;->c:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "S_TEXT/UTF8"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v4, 0x2

    .line 38
    const-string v5, "S_TEXT/WEBVTT"

    .line 39
    .line 40
    const-string v6, "S_TEXT/ASS"

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iget-object v2, v1, Lj6/c;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    iget-object v2, v1, Lj6/c;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    :cond_1
    iget v2, v0, Lj6/d;->N:I

    .line 62
    .line 63
    const-string v8, "MatroskaExtractor"

    .line 64
    .line 65
    if-le v2, v9, :cond_2

    .line 66
    .line 67
    const-string v2, "Skipping subtitle sample in laced block."

    .line 68
    .line 69
    invoke-static {v8, v2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-wide v10, v0, Lj6/d;->L:J

    .line 74
    .line 75
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v2, v10, v12

    .line 81
    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    const-string v2, "Skipping subtitle sample with no duration."

    .line 85
    .line 86
    invoke-static {v8, v2}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_0
    move/from16 v2, p5

    .line 90
    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_4
    iget-object v2, v1, Lj6/c;->c:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v8, v0, Lj6/d;->m:Lp4/s;

    .line 96
    .line 97
    iget-object v12, v8, Lp4/s;->a:[B

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    const/4 v14, -0x1

    .line 107
    sparse-switch v13, :sswitch_data_0

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const/4 v14, 0x2

    .line 119
    goto :goto_1

    .line 120
    :sswitch_1
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_6

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_6
    const/4 v14, 0x1

    .line 128
    goto :goto_1

    .line 129
    :sswitch_2
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_7

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    const/4 v14, 0x0

    .line 137
    :goto_1
    const-wide/16 v2, 0x3e8

    .line 138
    .line 139
    packed-switch v14, :pswitch_data_0

    .line 140
    .line 141
    .line 142
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 145
    .line 146
    .line 147
    throw v1

    .line 148
    :pswitch_0
    const-string v5, "%02d:%02d:%02d,%03d"

    .line 149
    .line 150
    invoke-static {v10, v11, v2, v3, v5}, Lj6/d;->k(JJLjava/lang/String;)[B

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v3, 0x13

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :pswitch_1
    const-string v5, "%02d:%02d:%02d.%03d"

    .line 158
    .line 159
    invoke-static {v10, v11, v2, v3, v5}, Lj6/d;->k(JJLjava/lang/String;)[B

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    const/16 v3, 0x19

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :pswitch_2
    const-string v2, "%01d:%02d:%02d:%02d"

    .line 167
    .line 168
    const-wide/16 v5, 0x2710

    .line 169
    .line 170
    invoke-static {v10, v11, v5, v6, v2}, Lj6/d;->k(JJLjava/lang/String;)[B

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    const/16 v3, 0x15

    .line 175
    .line 176
    :goto_2
    array-length v5, v2

    .line 177
    invoke-static {v2, v7, v12, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 178
    .line 179
    .line 180
    iget v2, v8, Lp4/s;->b:I

    .line 181
    .line 182
    :goto_3
    iget v3, v8, Lp4/s;->c:I

    .line 183
    .line 184
    if-ge v2, v3, :cond_9

    .line 185
    .line 186
    iget-object v3, v8, Lp4/s;->a:[B

    .line 187
    .line 188
    aget-byte v3, v3, v2

    .line 189
    .line 190
    if-nez v3, :cond_8

    .line 191
    .line 192
    invoke-virtual {v8, v2}, Lp4/s;->F(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_9
    :goto_4
    iget-object v2, v1, Lj6/c;->Z:Lr5/h0;

    .line 200
    .line 201
    iget v3, v8, Lp4/s;->c:I

    .line 202
    .line 203
    invoke-interface {v2, v3, v8}, Lr5/h0;->e(ILp4/s;)V

    .line 204
    .line 205
    .line 206
    iget v2, v8, Lp4/s;->c:I

    .line 207
    .line 208
    add-int v2, p5, v2

    .line 209
    .line 210
    :goto_5
    const/high16 v3, 0x10000000

    .line 211
    .line 212
    and-int v3, p4, v3

    .line 213
    .line 214
    if-eqz v3, :cond_b

    .line 215
    .line 216
    iget v3, v0, Lj6/d;->N:I

    .line 217
    .line 218
    iget-object v5, v0, Lj6/d;->p:Lp4/s;

    .line 219
    .line 220
    if-le v3, v9, :cond_a

    .line 221
    .line 222
    invoke-virtual {v5, v7}, Lp4/s;->D(I)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_a
    iget v3, v5, Lp4/s;->c:I

    .line 227
    .line 228
    iget-object v6, v1, Lj6/c;->Z:Lr5/h0;

    .line 229
    .line 230
    invoke-interface {v6, v5, v3, v4}, Lr5/h0;->f(Lp4/s;II)V

    .line 231
    .line 232
    .line 233
    add-int/2addr v2, v3

    .line 234
    :cond_b
    :goto_6
    move v14, v2

    .line 235
    iget-object v10, v1, Lj6/c;->Z:Lr5/h0;

    .line 236
    .line 237
    iget-object v1, v1, Lj6/c;->k:Lr5/g0;

    .line 238
    .line 239
    move-wide/from16 v11, p2

    .line 240
    .line 241
    move/from16 v13, p4

    .line 242
    .line 243
    move/from16 v15, p6

    .line 244
    .line 245
    move-object/from16 v16, v1

    .line 246
    .line 247
    invoke-interface/range {v10 .. v16}, Lr5/h0;->a(JIIILr5/g0;)V

    .line 248
    .line 249
    .line 250
    :goto_7
    iput-boolean v9, v0, Lj6/d;->I:Z

    .line 251
    .line 252
    return-void

    .line 253
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method

.method public final f(Lr5/o;)Z
    .locals 16

    .line 1
    new-instance v0, Lb7/m;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v2, v1}, Lb7/m;-><init>(BI)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lp4/s;

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    check-cast v2, Lr5/k;

    .line 15
    .line 16
    iget-wide v3, v2, Lr5/k;->c:J

    .line 17
    .line 18
    const-wide/16 v5, -0x1

    .line 19
    .line 20
    const-wide/16 v7, 0x400

    .line 21
    .line 22
    cmp-long v9, v3, v5

    .line 23
    .line 24
    if-eqz v9, :cond_1

    .line 25
    .line 26
    cmp-long v5, v3, v7

    .line 27
    .line 28
    if-lez v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-wide v7, v3

    .line 32
    :cond_1
    :goto_0
    long-to-int v5, v7

    .line 33
    iget-object v6, v1, Lp4/s;->a:[B

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x4

    .line 37
    invoke-virtual {v2, v6, v7, v8, v7}, Lr5/k;->i([BIIZ)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lp4/s;->w()J

    .line 41
    .line 42
    .line 43
    move-result-wide v10

    .line 44
    iput v8, v0, Lb7/m;->b:I

    .line 45
    .line 46
    :goto_1
    const-wide/32 v12, 0x1a45dfa3

    .line 47
    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    cmp-long v8, v10, v12

    .line 51
    .line 52
    if-eqz v8, :cond_3

    .line 53
    .line 54
    iget v8, v0, Lb7/m;->b:I

    .line 55
    .line 56
    add-int/2addr v8, v6

    .line 57
    iput v8, v0, Lb7/m;->b:I

    .line 58
    .line 59
    if-ne v8, v5, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    iget-object v8, v1, Lp4/s;->a:[B

    .line 63
    .line 64
    invoke-virtual {v2, v8, v7, v6, v7}, Lr5/k;->i([BIIZ)Z

    .line 65
    .line 66
    .line 67
    const/16 v6, 0x8

    .line 68
    .line 69
    shl-long/2addr v10, v6

    .line 70
    const-wide/16 v12, -0x100

    .line 71
    .line 72
    and-long/2addr v10, v12

    .line 73
    iget-object v6, v1, Lp4/s;->a:[B

    .line 74
    .line 75
    aget-byte v6, v6, v7

    .line 76
    .line 77
    and-int/lit16 v6, v6, 0xff

    .line 78
    .line 79
    int-to-long v12, v6

    .line 80
    or-long/2addr v10, v12

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-virtual {v0, v2}, Lb7/m;->s(Lr5/k;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v10

    .line 86
    iget v1, v0, Lb7/m;->b:I

    .line 87
    .line 88
    int-to-long v12, v1

    .line 89
    const-wide/high16 v14, -0x8000000000000000L

    .line 90
    .line 91
    cmp-long v1, v10, v14

    .line 92
    .line 93
    if-eqz v1, :cond_8

    .line 94
    .line 95
    if-eqz v9, :cond_4

    .line 96
    .line 97
    add-long v8, v12, v10

    .line 98
    .line 99
    cmp-long v1, v8, v3

    .line 100
    .line 101
    if-ltz v1, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    :goto_2
    iget v1, v0, Lb7/m;->b:I

    .line 105
    .line 106
    int-to-long v3, v1

    .line 107
    add-long v8, v12, v10

    .line 108
    .line 109
    cmp-long v1, v3, v8

    .line 110
    .line 111
    if-gez v1, :cond_7

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lb7/m;->s(Lr5/k;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    cmp-long v1, v3, v14

    .line 118
    .line 119
    if-nez v1, :cond_5

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-virtual {v0, v2}, Lb7/m;->s(Lr5/k;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v3

    .line 126
    const-wide/16 v8, 0x0

    .line 127
    .line 128
    cmp-long v1, v3, v8

    .line 129
    .line 130
    if-ltz v1, :cond_8

    .line 131
    .line 132
    const-wide/32 v8, 0x7fffffff

    .line 133
    .line 134
    .line 135
    cmp-long v5, v3, v8

    .line 136
    .line 137
    if-lez v5, :cond_6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    if-eqz v1, :cond_4

    .line 141
    .line 142
    long-to-int v1, v3

    .line 143
    invoke-virtual {v2, v1, v7}, Lr5/k;->a(IZ)Z

    .line 144
    .line 145
    .line 146
    iget v3, v0, Lb7/m;->b:I

    .line 147
    .line 148
    add-int/2addr v3, v1

    .line 149
    iput v3, v0, Lb7/m;->b:I

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_7
    if-nez v1, :cond_8

    .line 153
    .line 154
    return v6

    .line 155
    :cond_8
    :goto_3
    return v7
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public final g(Lr5/o;Lb0/a;)I
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    iput-boolean v3, v0, Lj6/d;->I:Z

    .line 5
    .line 6
    const/4 v5, 0x1

    .line 7
    :goto_0
    const/4 v6, -0x1

    .line 8
    if-eqz v5, :cond_b8

    .line 9
    .line 10
    iget-boolean v7, v0, Lj6/d;->I:Z

    .line 11
    .line 12
    if-nez v7, :cond_b8

    .line 13
    .line 14
    iget-object v7, v0, Lj6/d;->a:Lj6/b;

    .line 15
    .line 16
    iget-object v8, v7, Lj6/b;->c:Lj6/e;

    .line 17
    .line 18
    iget-object v9, v7, Lj6/b;->b:Ljava/util/ArrayDeque;

    .line 19
    .line 20
    iget-object v5, v7, Lj6/b;->d:Li7/p2;

    .line 21
    .line 22
    invoke-static {v5}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Lj6/a;

    .line 30
    .line 31
    const-wide/16 v17, 0x0

    .line 32
    .line 33
    const-wide/16 v20, -0x1

    .line 34
    .line 35
    const v11, 0x1654ae6b

    .line 36
    .line 37
    .line 38
    const v15, 0x1549a966

    .line 39
    .line 40
    .line 41
    const/16 v10, 0x4dbb

    .line 42
    .line 43
    const/16 v13, 0xae

    .line 44
    .line 45
    const/16 v23, 0x8

    .line 46
    .line 47
    const/16 v14, 0xa0

    .line 48
    .line 49
    const/16 v24, 0x0

    .line 50
    .line 51
    const/high16 v25, -0x40800000    # -1.0f

    .line 52
    .line 53
    const v3, 0x1c53bb6b

    .line 54
    .line 55
    .line 56
    if-eqz v5, :cond_8a

    .line 57
    .line 58
    invoke-interface/range {p1 .. p1}, Lr5/o;->getPosition()J

    .line 59
    .line 60
    .line 61
    move-result-wide v26

    .line 62
    iget-wide v4, v5, Lj6/a;->b:J

    .line 63
    .line 64
    cmp-long v29, v26, v4

    .line 65
    .line 66
    if-ltz v29, :cond_8a

    .line 67
    .line 68
    iget-object v4, v7, Lj6/b;->d:Li7/p2;

    .line 69
    .line 70
    invoke-virtual {v9}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Lj6/a;

    .line 75
    .line 76
    iget v5, v5, Lj6/a;->a:I

    .line 77
    .line 78
    iget-object v4, v4, Li7/p2;->a:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Lj6/d;

    .line 81
    .line 82
    iget-object v7, v4, Lj6/d;->c:Landroid/util/SparseArray;

    .line 83
    .line 84
    iget-object v8, v4, Lj6/d;->e0:Lr5/q;

    .line 85
    .line 86
    invoke-static {v8}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const-string v8, "A_OPUS"

    .line 90
    .line 91
    if-eq v5, v14, :cond_84

    .line 92
    .line 93
    const-string v9, "video/webm"

    .line 94
    .line 95
    const-string v14, "MatroskaExtractor"

    .line 96
    .line 97
    if-eq v5, v13, :cond_13

    .line 98
    .line 99
    if-eq v5, v10, :cond_11

    .line 100
    .line 101
    const/16 v6, 0x6240

    .line 102
    .line 103
    if-eq v5, v6, :cond_f

    .line 104
    .line 105
    const/16 v6, 0x6d80

    .line 106
    .line 107
    if-eq v5, v6, :cond_d

    .line 108
    .line 109
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    if-eq v5, v15, :cond_b

    .line 115
    .line 116
    if-eq v5, v11, :cond_9

    .line 117
    .line 118
    if-eq v5, v3, :cond_0

    .line 119
    .line 120
    goto/16 :goto_33

    .line 121
    .line 122
    :cond_0
    iget-boolean v3, v4, Lj6/d;->y:Z

    .line 123
    .line 124
    if-nez v3, :cond_7

    .line 125
    .line 126
    iget-object v3, v4, Lj6/d;->e0:Lr5/q;

    .line 127
    .line 128
    iget-object v5, v4, Lj6/d;->F:Ld2/b;

    .line 129
    .line 130
    iget-object v6, v4, Lj6/d;->G:Ld2/b;

    .line 131
    .line 132
    iget-wide v10, v4, Lj6/d;->s:J

    .line 133
    .line 134
    cmp-long v7, v10, v20

    .line 135
    .line 136
    if-eqz v7, :cond_6

    .line 137
    .line 138
    iget-wide v10, v4, Lj6/d;->v:J

    .line 139
    .line 140
    cmp-long v7, v10, v8

    .line 141
    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    if-eqz v5, :cond_6

    .line 145
    .line 146
    iget v7, v5, Ld2/b;->b:I

    .line 147
    .line 148
    if-eqz v7, :cond_6

    .line 149
    .line 150
    if-eqz v6, :cond_6

    .line 151
    .line 152
    iget v8, v6, Ld2/b;->b:I

    .line 153
    .line 154
    if-eq v8, v7, :cond_1

    .line 155
    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :cond_1
    new-array v8, v7, [I

    .line 159
    .line 160
    new-array v9, v7, [J

    .line 161
    .line 162
    new-array v10, v7, [J

    .line 163
    .line 164
    new-array v11, v7, [J

    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    :goto_2
    if-ge v13, v7, :cond_2

    .line 168
    .line 169
    invoke-virtual {v5, v13}, Ld2/b;->d(I)J

    .line 170
    .line 171
    .line 172
    move-result-wide v15

    .line 173
    aput-wide v15, v11, v13

    .line 174
    .line 175
    iget-wide v0, v4, Lj6/d;->s:J

    .line 176
    .line 177
    invoke-virtual {v6, v13}, Ld2/b;->d(I)J

    .line 178
    .line 179
    .line 180
    move-result-wide v15

    .line 181
    add-long/2addr v15, v0

    .line 182
    aput-wide v15, v9, v13

    .line 183
    .line 184
    add-int/lit8 v13, v13, 0x1

    .line 185
    .line 186
    move-object/from16 v0, p0

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_2
    const/4 v0, 0x0

    .line 190
    :goto_3
    add-int/lit8 v1, v7, -0x1

    .line 191
    .line 192
    if-ge v0, v1, :cond_3

    .line 193
    .line 194
    add-int/lit8 v1, v0, 0x1

    .line 195
    .line 196
    aget-wide v5, v9, v1

    .line 197
    .line 198
    aget-wide v15, v9, v0

    .line 199
    .line 200
    sub-long/2addr v5, v15

    .line 201
    long-to-int v6, v5

    .line 202
    aput v6, v8, v0

    .line 203
    .line 204
    aget-wide v5, v11, v1

    .line 205
    .line 206
    aget-wide v15, v11, v0

    .line 207
    .line 208
    sub-long/2addr v5, v15

    .line 209
    aput-wide v5, v10, v0

    .line 210
    .line 211
    move v0, v1

    .line 212
    goto :goto_3

    .line 213
    :cond_3
    move v0, v1

    .line 214
    :goto_4
    if-lez v0, :cond_4

    .line 215
    .line 216
    aget-wide v5, v11, v0

    .line 217
    .line 218
    iget-wide v12, v4, Lj6/d;->v:J

    .line 219
    .line 220
    cmp-long v7, v5, v12

    .line 221
    .line 222
    if-lez v7, :cond_4

    .line 223
    .line 224
    add-int/lit8 v0, v0, -0x1

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_4
    iget-wide v5, v4, Lj6/d;->s:J

    .line 228
    .line 229
    iget-wide v12, v4, Lj6/d;->r:J

    .line 230
    .line 231
    add-long/2addr v5, v12

    .line 232
    aget-wide v12, v9, v0

    .line 233
    .line 234
    sub-long/2addr v5, v12

    .line 235
    long-to-int v6, v5

    .line 236
    aput v6, v8, v0

    .line 237
    .line 238
    iget-wide v5, v4, Lj6/d;->v:J

    .line 239
    .line 240
    aget-wide v12, v11, v0

    .line 241
    .line 242
    sub-long/2addr v5, v12

    .line 243
    aput-wide v5, v10, v0

    .line 244
    .line 245
    if-ge v0, v1, :cond_5

    .line 246
    .line 247
    const-string v1, "Discarding trailing cue points with timestamps greater than total duration"

    .line 248
    .line 249
    invoke-static {v14, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    add-int/lit8 v0, v0, 0x1

    .line 253
    .line 254
    invoke-static {v8, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    invoke-static {v9, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-static {v10, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-static {v11, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    :cond_5
    new-instance v0, Lr5/j;

    .line 271
    .line 272
    invoke-direct {v0, v8, v9, v10, v11}, Lr5/j;-><init>([I[J[J[J)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_6
    :goto_5
    new-instance v0, Lr5/s;

    .line 277
    .line 278
    iget-wide v5, v4, Lj6/d;->v:J

    .line 279
    .line 280
    invoke-direct {v0, v5, v6}, Lr5/s;-><init>(J)V

    .line 281
    .line 282
    .line 283
    :goto_6
    invoke-interface {v3, v0}, Lr5/q;->a(Lr5/b0;)V

    .line 284
    .line 285
    .line 286
    const/4 v0, 0x1

    .line 287
    iput-boolean v0, v4, Lj6/d;->y:Z

    .line 288
    .line 289
    :cond_7
    const/4 v0, 0x0

    .line 290
    iput-object v0, v4, Lj6/d;->F:Ld2/b;

    .line 291
    .line 292
    iput-object v0, v4, Lj6/d;->G:Ld2/b;

    .line 293
    .line 294
    :cond_8
    :goto_7
    const/4 v0, 0x0

    .line 295
    goto/16 :goto_36

    .line 296
    .line 297
    :cond_9
    const/4 v0, 0x0

    .line 298
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_a

    .line 303
    .line 304
    iget-object v0, v4, Lj6/d;->e0:Lr5/q;

    .line 305
    .line 306
    invoke-interface {v0}, Lr5/q;->n()V

    .line 307
    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_a
    const-string v1, "No valid tracks were found"

    .line 311
    .line 312
    invoke-static {v0, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    throw v0

    .line 317
    :cond_b
    iget-wide v0, v4, Lj6/d;->t:J

    .line 318
    .line 319
    cmp-long v3, v0, v8

    .line 320
    .line 321
    if-nez v3, :cond_c

    .line 322
    .line 323
    const-wide/32 v0, 0xf4240

    .line 324
    .line 325
    .line 326
    iput-wide v0, v4, Lj6/d;->t:J

    .line 327
    .line 328
    :cond_c
    iget-wide v0, v4, Lj6/d;->u:J

    .line 329
    .line 330
    cmp-long v3, v0, v8

    .line 331
    .line 332
    if-eqz v3, :cond_8

    .line 333
    .line 334
    invoke-virtual {v4, v0, v1}, Lj6/d;->n(J)J

    .line 335
    .line 336
    .line 337
    move-result-wide v0

    .line 338
    iput-wide v0, v4, Lj6/d;->v:J

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_d
    invoke-virtual {v4, v5}, Lj6/d;->d(I)V

    .line 342
    .line 343
    .line 344
    iget-object v0, v4, Lj6/d;->x:Lj6/c;

    .line 345
    .line 346
    iget-boolean v1, v0, Lj6/c;->i:Z

    .line 347
    .line 348
    if-eqz v1, :cond_8

    .line 349
    .line 350
    iget-object v0, v0, Lj6/c;->j:[B

    .line 351
    .line 352
    if-nez v0, :cond_e

    .line 353
    .line 354
    goto/16 :goto_33

    .line 355
    .line 356
    :cond_e
    const-string v0, "Combining encryption and compression is not supported"

    .line 357
    .line 358
    const/4 v1, 0x0

    .line 359
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    throw v0

    .line 364
    :cond_f
    invoke-virtual {v4, v5}, Lj6/d;->d(I)V

    .line 365
    .line 366
    .line 367
    iget-object v0, v4, Lj6/d;->x:Lj6/c;

    .line 368
    .line 369
    iget-boolean v1, v0, Lj6/c;->i:Z

    .line 370
    .line 371
    if-eqz v1, :cond_8

    .line 372
    .line 373
    iget-object v1, v0, Lj6/c;->k:Lr5/g0;

    .line 374
    .line 375
    if-eqz v1, :cond_10

    .line 376
    .line 377
    new-instance v3, Lm4/n;

    .line 378
    .line 379
    new-instance v4, Lm4/m;

    .line 380
    .line 381
    sget-object v5, Lm4/g;->a:Ljava/util/UUID;

    .line 382
    .line 383
    iget-object v1, v1, Lr5/g0;->b:[B

    .line 384
    .line 385
    const/4 v6, 0x0

    .line 386
    invoke-direct {v4, v5, v6, v9, v1}, Lm4/m;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 387
    .line 388
    .line 389
    const/4 v1, 0x1

    .line 390
    new-array v5, v1, [Lm4/m;

    .line 391
    .line 392
    aput-object v4, v5, v24

    .line 393
    .line 394
    invoke-direct {v3, v6, v1, v5}, Lm4/n;-><init>(Ljava/lang/String;Z[Lm4/m;)V

    .line 395
    .line 396
    .line 397
    iput-object v3, v0, Lj6/c;->m:Lm4/n;

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_10
    const/4 v6, 0x0

    .line 401
    const-string v0, "Encrypted Track found but ContentEncKeyID was not found"

    .line 402
    .line 403
    invoke-static {v6, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    throw v0

    .line 408
    :cond_11
    iget v0, v4, Lj6/d;->z:I

    .line 409
    .line 410
    if-eq v0, v6, :cond_12

    .line 411
    .line 412
    iget-wide v5, v4, Lj6/d;->A:J

    .line 413
    .line 414
    cmp-long v1, v5, v20

    .line 415
    .line 416
    if-eqz v1, :cond_12

    .line 417
    .line 418
    if-ne v0, v3, :cond_8

    .line 419
    .line 420
    iput-wide v5, v4, Lj6/d;->C:J

    .line 421
    .line 422
    goto/16 :goto_7

    .line 423
    .line 424
    :cond_12
    const-string v0, "Mandatory element SeekID or SeekPosition not found"

    .line 425
    .line 426
    const/4 v1, 0x0

    .line 427
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    throw v0

    .line 432
    :cond_13
    iget-object v0, v4, Lj6/d;->x:Lj6/c;

    .line 433
    .line 434
    invoke-static {v0}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    iget-object v1, v0, Lj6/c;->c:Ljava/lang/String;

    .line 438
    .line 439
    if-eqz v1, :cond_83

    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    const-string v5, "A_MPEG/L3"

    .line 446
    .line 447
    const-string v10, "A_MPEG/L2"

    .line 448
    .line 449
    const-string v11, "A_VORBIS"

    .line 450
    .line 451
    const-string v12, "A_TRUEHD"

    .line 452
    .line 453
    const-string v13, "A_MS/ACM"

    .line 454
    .line 455
    const-string v15, "V_MPEG4/ISO/SP"

    .line 456
    .line 457
    const-string v6, "V_MPEG4/ISO/AP"

    .line 458
    .line 459
    move/from16 v17, v3

    .line 460
    .line 461
    const/16 v29, 0x14

    .line 462
    .line 463
    sparse-switch v17, :sswitch_data_0

    .line 464
    .line 465
    .line 466
    :goto_8
    const/4 v3, -0x1

    .line 467
    goto/16 :goto_9

    .line 468
    .line 469
    :sswitch_0
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v17

    .line 473
    if-nez v17, :cond_14

    .line 474
    .line 475
    goto :goto_8

    .line 476
    :cond_14
    const/16 v3, 0x20

    .line 477
    .line 478
    goto/16 :goto_9

    .line 479
    .line 480
    :sswitch_1
    const-string v3, "A_FLAC"

    .line 481
    .line 482
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    if-nez v3, :cond_15

    .line 487
    .line 488
    goto :goto_8

    .line 489
    :cond_15
    const/16 v3, 0x1f

    .line 490
    .line 491
    goto/16 :goto_9

    .line 492
    .line 493
    :sswitch_2
    const-string v3, "A_EAC3"

    .line 494
    .line 495
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-nez v3, :cond_16

    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_16
    const/16 v3, 0x1e

    .line 503
    .line 504
    goto/16 :goto_9

    .line 505
    .line 506
    :sswitch_3
    const-string v3, "V_MPEG2"

    .line 507
    .line 508
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    if-nez v3, :cond_17

    .line 513
    .line 514
    goto :goto_8

    .line 515
    :cond_17
    const/16 v3, 0x1d

    .line 516
    .line 517
    goto/16 :goto_9

    .line 518
    .line 519
    :sswitch_4
    const-string v3, "S_TEXT/UTF8"

    .line 520
    .line 521
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-nez v3, :cond_18

    .line 526
    .line 527
    goto :goto_8

    .line 528
    :cond_18
    const/16 v3, 0x1c

    .line 529
    .line 530
    goto/16 :goto_9

    .line 531
    .line 532
    :sswitch_5
    const-string v3, "S_TEXT/WEBVTT"

    .line 533
    .line 534
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    if-nez v3, :cond_19

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :cond_19
    const/16 v3, 0x1b

    .line 542
    .line 543
    goto/16 :goto_9

    .line 544
    .line 545
    :sswitch_6
    const-string v3, "V_MPEGH/ISO/HEVC"

    .line 546
    .line 547
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v3

    .line 551
    if-nez v3, :cond_1a

    .line 552
    .line 553
    goto :goto_8

    .line 554
    :cond_1a
    const/16 v3, 0x1a

    .line 555
    .line 556
    goto/16 :goto_9

    .line 557
    .line 558
    :sswitch_7
    const-string v3, "S_TEXT/ASS"

    .line 559
    .line 560
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-nez v3, :cond_1b

    .line 565
    .line 566
    goto :goto_8

    .line 567
    :cond_1b
    const/16 v3, 0x19

    .line 568
    .line 569
    goto/16 :goto_9

    .line 570
    .line 571
    :sswitch_8
    const-string v3, "A_PCM/INT/LIT"

    .line 572
    .line 573
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    if-nez v3, :cond_1c

    .line 578
    .line 579
    goto :goto_8

    .line 580
    :cond_1c
    const/16 v3, 0x18

    .line 581
    .line 582
    goto/16 :goto_9

    .line 583
    .line 584
    :sswitch_9
    const-string v3, "A_PCM/INT/BIG"

    .line 585
    .line 586
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v3

    .line 590
    if-nez v3, :cond_1d

    .line 591
    .line 592
    goto :goto_8

    .line 593
    :cond_1d
    const/16 v3, 0x17

    .line 594
    .line 595
    goto/16 :goto_9

    .line 596
    .line 597
    :sswitch_a
    const-string v3, "A_PCM/FLOAT/IEEE"

    .line 598
    .line 599
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    if-nez v3, :cond_1e

    .line 604
    .line 605
    goto/16 :goto_8

    .line 606
    .line 607
    :cond_1e
    const/16 v3, 0x16

    .line 608
    .line 609
    goto/16 :goto_9

    .line 610
    .line 611
    :sswitch_b
    const-string v3, "A_DTS/EXPRESS"

    .line 612
    .line 613
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v3

    .line 617
    if-nez v3, :cond_1f

    .line 618
    .line 619
    goto/16 :goto_8

    .line 620
    .line 621
    :cond_1f
    const/16 v3, 0x15

    .line 622
    .line 623
    goto/16 :goto_9

    .line 624
    .line 625
    :sswitch_c
    const-string v3, "V_THEORA"

    .line 626
    .line 627
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v3

    .line 631
    if-nez v3, :cond_20

    .line 632
    .line 633
    goto/16 :goto_8

    .line 634
    .line 635
    :cond_20
    const/16 v3, 0x14

    .line 636
    .line 637
    goto/16 :goto_9

    .line 638
    .line 639
    :sswitch_d
    const-string v3, "S_HDMV/PGS"

    .line 640
    .line 641
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    if-nez v3, :cond_21

    .line 646
    .line 647
    goto/16 :goto_8

    .line 648
    .line 649
    :cond_21
    const/16 v3, 0x13

    .line 650
    .line 651
    goto/16 :goto_9

    .line 652
    .line 653
    :sswitch_e
    const-string v3, "V_VP9"

    .line 654
    .line 655
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v3

    .line 659
    if-nez v3, :cond_22

    .line 660
    .line 661
    goto/16 :goto_8

    .line 662
    .line 663
    :cond_22
    const/16 v3, 0x12

    .line 664
    .line 665
    goto/16 :goto_9

    .line 666
    .line 667
    :sswitch_f
    const-string v3, "V_VP8"

    .line 668
    .line 669
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    if-nez v3, :cond_23

    .line 674
    .line 675
    goto/16 :goto_8

    .line 676
    .line 677
    :cond_23
    const/16 v3, 0x11

    .line 678
    .line 679
    goto/16 :goto_9

    .line 680
    .line 681
    :sswitch_10
    const-string v3, "V_AV1"

    .line 682
    .line 683
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v3

    .line 687
    if-nez v3, :cond_24

    .line 688
    .line 689
    goto/16 :goto_8

    .line 690
    .line 691
    :cond_24
    const/16 v3, 0x10

    .line 692
    .line 693
    goto/16 :goto_9

    .line 694
    .line 695
    :sswitch_11
    const-string v3, "A_DTS"

    .line 696
    .line 697
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-nez v3, :cond_25

    .line 702
    .line 703
    goto/16 :goto_8

    .line 704
    .line 705
    :cond_25
    const/16 v3, 0xf

    .line 706
    .line 707
    goto/16 :goto_9

    .line 708
    .line 709
    :sswitch_12
    const-string v3, "A_AC3"

    .line 710
    .line 711
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-nez v3, :cond_26

    .line 716
    .line 717
    goto/16 :goto_8

    .line 718
    .line 719
    :cond_26
    const/16 v3, 0xe

    .line 720
    .line 721
    goto/16 :goto_9

    .line 722
    .line 723
    :sswitch_13
    const-string v3, "A_AAC"

    .line 724
    .line 725
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v3

    .line 729
    if-nez v3, :cond_27

    .line 730
    .line 731
    goto/16 :goto_8

    .line 732
    .line 733
    :cond_27
    const/16 v3, 0xd

    .line 734
    .line 735
    goto/16 :goto_9

    .line 736
    .line 737
    :sswitch_14
    const-string v3, "A_DTS/LOSSLESS"

    .line 738
    .line 739
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    if-nez v3, :cond_28

    .line 744
    .line 745
    goto/16 :goto_8

    .line 746
    .line 747
    :cond_28
    const/16 v3, 0xc

    .line 748
    .line 749
    goto/16 :goto_9

    .line 750
    .line 751
    :sswitch_15
    const-string v3, "S_VOBSUB"

    .line 752
    .line 753
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-nez v3, :cond_29

    .line 758
    .line 759
    goto/16 :goto_8

    .line 760
    .line 761
    :cond_29
    const/16 v3, 0xb

    .line 762
    .line 763
    goto/16 :goto_9

    .line 764
    .line 765
    :sswitch_16
    const-string v3, "V_MPEG4/ISO/AVC"

    .line 766
    .line 767
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    move-result v3

    .line 771
    if-nez v3, :cond_2a

    .line 772
    .line 773
    goto/16 :goto_8

    .line 774
    .line 775
    :cond_2a
    const/16 v3, 0xa

    .line 776
    .line 777
    goto/16 :goto_9

    .line 778
    .line 779
    :sswitch_17
    const-string v3, "V_MPEG4/ISO/ASP"

    .line 780
    .line 781
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v3

    .line 785
    if-nez v3, :cond_2b

    .line 786
    .line 787
    goto/16 :goto_8

    .line 788
    .line 789
    :cond_2b
    const/16 v3, 0x9

    .line 790
    .line 791
    goto/16 :goto_9

    .line 792
    .line 793
    :sswitch_18
    const-string v3, "S_DVBSUB"

    .line 794
    .line 795
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    if-nez v3, :cond_2c

    .line 800
    .line 801
    goto/16 :goto_8

    .line 802
    .line 803
    :cond_2c
    const/16 v3, 0x8

    .line 804
    .line 805
    goto :goto_9

    .line 806
    :sswitch_19
    const-string v3, "V_MS/VFW/FOURCC"

    .line 807
    .line 808
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    move-result v3

    .line 812
    if-nez v3, :cond_2d

    .line 813
    .line 814
    goto/16 :goto_8

    .line 815
    .line 816
    :cond_2d
    const/4 v3, 0x7

    .line 817
    goto :goto_9

    .line 818
    :sswitch_1a
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    if-nez v3, :cond_2e

    .line 823
    .line 824
    goto/16 :goto_8

    .line 825
    .line 826
    :cond_2e
    const/4 v3, 0x6

    .line 827
    goto :goto_9

    .line 828
    :sswitch_1b
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    if-nez v3, :cond_2f

    .line 833
    .line 834
    goto/16 :goto_8

    .line 835
    .line 836
    :cond_2f
    const/4 v3, 0x5

    .line 837
    goto :goto_9

    .line 838
    :sswitch_1c
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    move-result v3

    .line 842
    if-nez v3, :cond_30

    .line 843
    .line 844
    goto/16 :goto_8

    .line 845
    .line 846
    :cond_30
    const/4 v3, 0x4

    .line 847
    goto :goto_9

    .line 848
    :sswitch_1d
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    if-nez v3, :cond_31

    .line 853
    .line 854
    goto/16 :goto_8

    .line 855
    .line 856
    :cond_31
    const/4 v3, 0x3

    .line 857
    goto :goto_9

    .line 858
    :sswitch_1e
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    move-result v3

    .line 862
    if-nez v3, :cond_32

    .line 863
    .line 864
    goto/16 :goto_8

    .line 865
    .line 866
    :cond_32
    const/4 v3, 0x2

    .line 867
    goto :goto_9

    .line 868
    :sswitch_1f
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    move-result v3

    .line 872
    if-nez v3, :cond_33

    .line 873
    .line 874
    goto/16 :goto_8

    .line 875
    .line 876
    :cond_33
    const/4 v3, 0x1

    .line 877
    goto :goto_9

    .line 878
    :sswitch_20
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v3

    .line 882
    if-nez v3, :cond_34

    .line 883
    .line 884
    goto/16 :goto_8

    .line 885
    .line 886
    :cond_34
    const/4 v3, 0x0

    .line 887
    :goto_9
    packed-switch v3, :pswitch_data_0

    .line 888
    .line 889
    .line 890
    :goto_a
    const/4 v1, 0x0

    .line 891
    goto/16 :goto_32

    .line 892
    .line 893
    :pswitch_0
    iget-object v3, v4, Lj6/d;->e0:Lr5/q;

    .line 894
    .line 895
    move-object/from16 v32, v9

    .line 896
    .line 897
    iget v9, v0, Lj6/c;->d:I

    .line 898
    .line 899
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 900
    .line 901
    .line 902
    move-result v33

    .line 903
    sparse-switch v33, :sswitch_data_1

    .line 904
    .line 905
    .line 906
    :goto_b
    const/4 v15, -0x1

    .line 907
    goto/16 :goto_c

    .line 908
    .line 909
    :sswitch_21
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    move-result v5

    .line 913
    if-nez v5, :cond_35

    .line 914
    .line 915
    goto :goto_b

    .line 916
    :cond_35
    const/16 v15, 0x20

    .line 917
    .line 918
    goto/16 :goto_c

    .line 919
    .line 920
    :sswitch_22
    const-string v5, "A_FLAC"

    .line 921
    .line 922
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v5

    .line 926
    if-nez v5, :cond_36

    .line 927
    .line 928
    goto :goto_b

    .line 929
    :cond_36
    const/16 v15, 0x1f

    .line 930
    .line 931
    goto/16 :goto_c

    .line 932
    .line 933
    :sswitch_23
    const-string v5, "A_EAC3"

    .line 934
    .line 935
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v5

    .line 939
    if-nez v5, :cond_37

    .line 940
    .line 941
    goto :goto_b

    .line 942
    :cond_37
    const/16 v15, 0x1e

    .line 943
    .line 944
    goto/16 :goto_c

    .line 945
    .line 946
    :sswitch_24
    const-string v5, "V_MPEG2"

    .line 947
    .line 948
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 949
    .line 950
    .line 951
    move-result v5

    .line 952
    if-nez v5, :cond_38

    .line 953
    .line 954
    goto :goto_b

    .line 955
    :cond_38
    const/16 v15, 0x1d

    .line 956
    .line 957
    goto/16 :goto_c

    .line 958
    .line 959
    :sswitch_25
    const-string v5, "S_TEXT/UTF8"

    .line 960
    .line 961
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    move-result v5

    .line 965
    if-nez v5, :cond_39

    .line 966
    .line 967
    goto :goto_b

    .line 968
    :cond_39
    const/16 v15, 0x1c

    .line 969
    .line 970
    goto/16 :goto_c

    .line 971
    .line 972
    :sswitch_26
    const-string v5, "S_TEXT/WEBVTT"

    .line 973
    .line 974
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    move-result v5

    .line 978
    if-nez v5, :cond_3a

    .line 979
    .line 980
    goto :goto_b

    .line 981
    :cond_3a
    const/16 v15, 0x1b

    .line 982
    .line 983
    goto/16 :goto_c

    .line 984
    .line 985
    :sswitch_27
    const-string v5, "V_MPEGH/ISO/HEVC"

    .line 986
    .line 987
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    move-result v5

    .line 991
    if-nez v5, :cond_3b

    .line 992
    .line 993
    goto :goto_b

    .line 994
    :cond_3b
    const/16 v15, 0x1a

    .line 995
    .line 996
    goto/16 :goto_c

    .line 997
    .line 998
    :sswitch_28
    const-string v5, "S_TEXT/ASS"

    .line 999
    .line 1000
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v5

    .line 1004
    if-nez v5, :cond_3c

    .line 1005
    .line 1006
    goto :goto_b

    .line 1007
    :cond_3c
    const/16 v15, 0x19

    .line 1008
    .line 1009
    goto/16 :goto_c

    .line 1010
    .line 1011
    :sswitch_29
    const-string v5, "A_PCM/INT/LIT"

    .line 1012
    .line 1013
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1014
    .line 1015
    .line 1016
    move-result v5

    .line 1017
    if-nez v5, :cond_3d

    .line 1018
    .line 1019
    goto :goto_b

    .line 1020
    :cond_3d
    const/16 v15, 0x18

    .line 1021
    .line 1022
    goto/16 :goto_c

    .line 1023
    .line 1024
    :sswitch_2a
    const-string v5, "A_PCM/INT/BIG"

    .line 1025
    .line 1026
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1027
    .line 1028
    .line 1029
    move-result v5

    .line 1030
    if-nez v5, :cond_3e

    .line 1031
    .line 1032
    goto :goto_b

    .line 1033
    :cond_3e
    const/16 v15, 0x17

    .line 1034
    .line 1035
    goto/16 :goto_c

    .line 1036
    .line 1037
    :sswitch_2b
    const-string v5, "A_PCM/FLOAT/IEEE"

    .line 1038
    .line 1039
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v5

    .line 1043
    if-nez v5, :cond_3f

    .line 1044
    .line 1045
    goto/16 :goto_b

    .line 1046
    .line 1047
    :cond_3f
    const/16 v15, 0x16

    .line 1048
    .line 1049
    goto/16 :goto_c

    .line 1050
    .line 1051
    :sswitch_2c
    const-string v5, "A_DTS/EXPRESS"

    .line 1052
    .line 1053
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v5

    .line 1057
    if-nez v5, :cond_40

    .line 1058
    .line 1059
    goto/16 :goto_b

    .line 1060
    .line 1061
    :cond_40
    const/16 v15, 0x15

    .line 1062
    .line 1063
    goto/16 :goto_c

    .line 1064
    .line 1065
    :sswitch_2d
    const-string v5, "V_THEORA"

    .line 1066
    .line 1067
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1068
    .line 1069
    .line 1070
    move-result v5

    .line 1071
    if-nez v5, :cond_41

    .line 1072
    .line 1073
    goto/16 :goto_b

    .line 1074
    .line 1075
    :cond_41
    const/16 v15, 0x14

    .line 1076
    .line 1077
    goto/16 :goto_c

    .line 1078
    .line 1079
    :sswitch_2e
    const-string v5, "S_HDMV/PGS"

    .line 1080
    .line 1081
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v5

    .line 1085
    if-nez v5, :cond_42

    .line 1086
    .line 1087
    goto/16 :goto_b

    .line 1088
    .line 1089
    :cond_42
    const/16 v15, 0x13

    .line 1090
    .line 1091
    goto/16 :goto_c

    .line 1092
    .line 1093
    :sswitch_2f
    const-string v5, "V_VP9"

    .line 1094
    .line 1095
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v5

    .line 1099
    if-nez v5, :cond_43

    .line 1100
    .line 1101
    goto/16 :goto_b

    .line 1102
    .line 1103
    :cond_43
    const/16 v15, 0x12

    .line 1104
    .line 1105
    goto/16 :goto_c

    .line 1106
    .line 1107
    :sswitch_30
    const-string v5, "V_VP8"

    .line 1108
    .line 1109
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v5

    .line 1113
    if-nez v5, :cond_44

    .line 1114
    .line 1115
    goto/16 :goto_b

    .line 1116
    .line 1117
    :cond_44
    const/16 v15, 0x11

    .line 1118
    .line 1119
    goto/16 :goto_c

    .line 1120
    .line 1121
    :sswitch_31
    const-string v5, "V_AV1"

    .line 1122
    .line 1123
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v5

    .line 1127
    if-nez v5, :cond_45

    .line 1128
    .line 1129
    goto/16 :goto_b

    .line 1130
    .line 1131
    :cond_45
    const/16 v15, 0x10

    .line 1132
    .line 1133
    goto/16 :goto_c

    .line 1134
    .line 1135
    :sswitch_32
    const-string v5, "A_DTS"

    .line 1136
    .line 1137
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v5

    .line 1141
    if-nez v5, :cond_46

    .line 1142
    .line 1143
    goto/16 :goto_b

    .line 1144
    .line 1145
    :cond_46
    const/16 v15, 0xf

    .line 1146
    .line 1147
    goto/16 :goto_c

    .line 1148
    .line 1149
    :sswitch_33
    const-string v5, "A_AC3"

    .line 1150
    .line 1151
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v5

    .line 1155
    if-nez v5, :cond_47

    .line 1156
    .line 1157
    goto/16 :goto_b

    .line 1158
    .line 1159
    :cond_47
    const/16 v15, 0xe

    .line 1160
    .line 1161
    goto/16 :goto_c

    .line 1162
    .line 1163
    :sswitch_34
    const-string v5, "A_AAC"

    .line 1164
    .line 1165
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v5

    .line 1169
    if-nez v5, :cond_48

    .line 1170
    .line 1171
    goto/16 :goto_b

    .line 1172
    .line 1173
    :cond_48
    const/16 v15, 0xd

    .line 1174
    .line 1175
    goto/16 :goto_c

    .line 1176
    .line 1177
    :sswitch_35
    const-string v5, "A_DTS/LOSSLESS"

    .line 1178
    .line 1179
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v5

    .line 1183
    if-nez v5, :cond_49

    .line 1184
    .line 1185
    goto/16 :goto_b

    .line 1186
    .line 1187
    :cond_49
    const/16 v15, 0xc

    .line 1188
    .line 1189
    goto/16 :goto_c

    .line 1190
    .line 1191
    :sswitch_36
    const-string v5, "S_VOBSUB"

    .line 1192
    .line 1193
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v5

    .line 1197
    if-nez v5, :cond_4a

    .line 1198
    .line 1199
    goto/16 :goto_b

    .line 1200
    .line 1201
    :cond_4a
    const/16 v15, 0xb

    .line 1202
    .line 1203
    goto/16 :goto_c

    .line 1204
    .line 1205
    :sswitch_37
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 1206
    .line 1207
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v5

    .line 1211
    if-nez v5, :cond_4b

    .line 1212
    .line 1213
    goto/16 :goto_b

    .line 1214
    .line 1215
    :cond_4b
    const/16 v15, 0xa

    .line 1216
    .line 1217
    goto/16 :goto_c

    .line 1218
    .line 1219
    :sswitch_38
    const-string v5, "V_MPEG4/ISO/ASP"

    .line 1220
    .line 1221
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1222
    .line 1223
    .line 1224
    move-result v5

    .line 1225
    if-nez v5, :cond_4c

    .line 1226
    .line 1227
    goto/16 :goto_b

    .line 1228
    .line 1229
    :cond_4c
    const/16 v15, 0x9

    .line 1230
    .line 1231
    goto/16 :goto_c

    .line 1232
    .line 1233
    :sswitch_39
    const-string v5, "S_DVBSUB"

    .line 1234
    .line 1235
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    move-result v5

    .line 1239
    if-nez v5, :cond_4d

    .line 1240
    .line 1241
    goto/16 :goto_b

    .line 1242
    .line 1243
    :cond_4d
    const/16 v15, 0x8

    .line 1244
    .line 1245
    goto :goto_c

    .line 1246
    :sswitch_3a
    const-string v5, "V_MS/VFW/FOURCC"

    .line 1247
    .line 1248
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v5

    .line 1252
    if-nez v5, :cond_4e

    .line 1253
    .line 1254
    goto/16 :goto_b

    .line 1255
    .line 1256
    :cond_4e
    const/4 v15, 0x7

    .line 1257
    goto :goto_c

    .line 1258
    :sswitch_3b
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v5

    .line 1262
    if-nez v5, :cond_4f

    .line 1263
    .line 1264
    goto/16 :goto_b

    .line 1265
    .line 1266
    :cond_4f
    const/4 v15, 0x6

    .line 1267
    goto :goto_c

    .line 1268
    :sswitch_3c
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v5

    .line 1272
    if-nez v5, :cond_50

    .line 1273
    .line 1274
    goto/16 :goto_b

    .line 1275
    .line 1276
    :cond_50
    const/4 v15, 0x5

    .line 1277
    goto :goto_c

    .line 1278
    :sswitch_3d
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1279
    .line 1280
    .line 1281
    move-result v5

    .line 1282
    if-nez v5, :cond_51

    .line 1283
    .line 1284
    goto/16 :goto_b

    .line 1285
    .line 1286
    :cond_51
    const/4 v15, 0x4

    .line 1287
    goto :goto_c

    .line 1288
    :sswitch_3e
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1289
    .line 1290
    .line 1291
    move-result v5

    .line 1292
    if-nez v5, :cond_52

    .line 1293
    .line 1294
    goto/16 :goto_b

    .line 1295
    .line 1296
    :cond_52
    const/4 v15, 0x3

    .line 1297
    goto :goto_c

    .line 1298
    :sswitch_3f
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v5

    .line 1302
    if-nez v5, :cond_53

    .line 1303
    .line 1304
    goto/16 :goto_b

    .line 1305
    .line 1306
    :cond_53
    const/4 v15, 0x2

    .line 1307
    goto :goto_c

    .line 1308
    :sswitch_40
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1309
    .line 1310
    .line 1311
    move-result v5

    .line 1312
    if-nez v5, :cond_54

    .line 1313
    .line 1314
    goto/16 :goto_b

    .line 1315
    .line 1316
    :cond_54
    const/4 v15, 0x1

    .line 1317
    goto :goto_c

    .line 1318
    :sswitch_41
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v5

    .line 1322
    if-nez v5, :cond_55

    .line 1323
    .line 1324
    goto/16 :goto_b

    .line 1325
    .line 1326
    :cond_55
    const/4 v15, 0x0

    .line 1327
    :goto_c
    const-string v6, "application/dvbsubs"

    .line 1328
    .line 1329
    const-string v8, "application/vobsub"

    .line 1330
    .line 1331
    const-string v10, "application/pgs"

    .line 1332
    .line 1333
    const-string v11, "video/x-unknown"

    .line 1334
    .line 1335
    const-string v12, "text/x-ssa"

    .line 1336
    .line 1337
    const-string v13, "text/vtt"

    .line 1338
    .line 1339
    const-string v5, "application/x-subrip"

    .line 1340
    .line 1341
    move/from16 v34, v9

    .line 1342
    .line 1343
    const-string v9, ". Setting mimeType to audio/x-unknown"

    .line 1344
    .line 1345
    const-string v35, "audio/raw"

    .line 1346
    .line 1347
    const-string v36, "audio/x-unknown"

    .line 1348
    .line 1349
    packed-switch v15, :pswitch_data_1

    .line 1350
    .line 1351
    .line 1352
    const-string v0, "Unrecognized codec identifier."

    .line 1353
    .line 1354
    const/4 v1, 0x0

    .line 1355
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    throw v0

    .line 1360
    :pswitch_1
    new-instance v1, Ljava/util/ArrayList;

    .line 1361
    .line 1362
    const/4 v9, 0x3

    .line 1363
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1364
    .line 1365
    .line 1366
    iget-object v9, v0, Lj6/c;->c:Ljava/lang/String;

    .line 1367
    .line 1368
    invoke-virtual {v0, v9}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1369
    .line 1370
    .line 1371
    move-result-object v9

    .line 1372
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1373
    .line 1374
    .line 1375
    invoke-static/range {v23 .. v23}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v9

    .line 1379
    sget-object v11, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1380
    .line 1381
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v9

    .line 1385
    iget-wide v14, v0, Lj6/c;->T:J

    .line 1386
    .line 1387
    invoke-virtual {v9, v14, v15}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v9

    .line 1391
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    .line 1392
    .line 1393
    .line 1394
    move-result-object v9

    .line 1395
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1396
    .line 1397
    .line 1398
    invoke-static/range {v23 .. v23}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v9

    .line 1402
    invoke-virtual {v9, v11}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v9

    .line 1406
    iget-wide v14, v0, Lj6/c;->U:J

    .line 1407
    .line 1408
    invoke-virtual {v9, v14, v15}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v9

    .line 1412
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    .line 1413
    .line 1414
    .line 1415
    move-result-object v9

    .line 1416
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    const-string v11, "audio/opus"

    .line 1420
    .line 1421
    const/16 v9, 0x1680

    .line 1422
    .line 1423
    move-object v9, v1

    .line 1424
    move-object/from16 v29, v4

    .line 1425
    .line 1426
    const/4 v1, -0x1

    .line 1427
    const/4 v2, 0x0

    .line 1428
    const/16 v4, 0x1680

    .line 1429
    .line 1430
    goto/16 :goto_25

    .line 1431
    .line 1432
    :pswitch_2
    invoke-virtual {v0, v1}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1433
    .line 1434
    .line 1435
    move-result-object v1

    .line 1436
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v1

    .line 1440
    const-string v11, "audio/flac"

    .line 1441
    .line 1442
    :goto_d
    move-object v9, v1

    .line 1443
    move-object/from16 v29, v4

    .line 1444
    .line 1445
    :goto_e
    const/4 v1, -0x1

    .line 1446
    const/4 v2, 0x0

    .line 1447
    :goto_f
    const/4 v4, -0x1

    .line 1448
    goto/16 :goto_25

    .line 1449
    .line 1450
    :pswitch_3
    const-string v11, "audio/eac3"

    .line 1451
    .line 1452
    :goto_10
    :pswitch_4
    move-object/from16 v29, v4

    .line 1453
    .line 1454
    :goto_11
    const/4 v1, -0x1

    .line 1455
    :goto_12
    const/4 v2, 0x0

    .line 1456
    const/4 v4, -0x1

    .line 1457
    :goto_13
    const/4 v9, 0x0

    .line 1458
    goto/16 :goto_25

    .line 1459
    .line 1460
    :pswitch_5
    const-string v11, "video/mpeg2"

    .line 1461
    .line 1462
    goto :goto_10

    .line 1463
    :pswitch_6
    move-object/from16 v29, v4

    .line 1464
    .line 1465
    move-object v11, v5

    .line 1466
    goto :goto_11

    .line 1467
    :pswitch_7
    move-object/from16 v29, v4

    .line 1468
    .line 1469
    move-object v11, v13

    .line 1470
    goto :goto_11

    .line 1471
    :pswitch_8
    new-instance v1, Lp4/s;

    .line 1472
    .line 1473
    iget-object v9, v0, Lj6/c;->c:Ljava/lang/String;

    .line 1474
    .line 1475
    invoke-virtual {v0, v9}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1476
    .line 1477
    .line 1478
    move-result-object v9

    .line 1479
    invoke-direct {v1, v9}, Lp4/s;-><init>([B)V

    .line 1480
    .line 1481
    .line 1482
    const/4 v9, 0x0

    .line 1483
    const/4 v11, 0x0

    .line 1484
    invoke-static {v1, v9, v11}, Lr5/w;->a(Lp4/s;ZLb0/w1;)Lr5/w;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v1

    .line 1488
    iget-object v9, v1, Lr5/w;->a:Ljava/util/List;

    .line 1489
    .line 1490
    iget v11, v1, Lr5/w;->b:I

    .line 1491
    .line 1492
    iput v11, v0, Lj6/c;->a0:I

    .line 1493
    .line 1494
    iget-object v1, v1, Lr5/w;->l:Ljava/lang/String;

    .line 1495
    .line 1496
    const-string v11, "video/hevc"

    .line 1497
    .line 1498
    :goto_14
    move-object v2, v1

    .line 1499
    move-object/from16 v29, v4

    .line 1500
    .line 1501
    :goto_15
    const/4 v1, -0x1

    .line 1502
    goto :goto_f

    .line 1503
    :pswitch_9
    sget-object v9, Lj6/d;->g0:[B

    .line 1504
    .line 1505
    invoke-virtual {v0, v1}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    invoke-static {v9, v1}, Lya/i0;->v(Ljava/lang/Object;Ljava/lang/Object;)Lya/a1;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v1

    .line 1513
    move-object v9, v1

    .line 1514
    move-object/from16 v29, v4

    .line 1515
    .line 1516
    move-object v11, v12

    .line 1517
    goto :goto_e

    .line 1518
    :pswitch_a
    iget v1, v0, Lj6/c;->R:I

    .line 1519
    .line 1520
    invoke-static {v1}, Lp4/c0;->A(I)I

    .line 1521
    .line 1522
    .line 1523
    move-result v1

    .line 1524
    if-nez v1, :cond_56

    .line 1525
    .line 1526
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1527
    .line 1528
    const-string v11, "Unsupported little endian PCM bit depth: "

    .line 1529
    .line 1530
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1531
    .line 1532
    .line 1533
    iget v11, v0, Lj6/c;->R:I

    .line 1534
    .line 1535
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v1

    .line 1545
    invoke-static {v14, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 1546
    .line 1547
    .line 1548
    :goto_16
    move-object/from16 v29, v4

    .line 1549
    .line 1550
    :goto_17
    move-object/from16 v11, v36

    .line 1551
    .line 1552
    goto :goto_11

    .line 1553
    :cond_56
    :goto_18
    move-object/from16 v29, v4

    .line 1554
    .line 1555
    :cond_57
    move-object/from16 v11, v35

    .line 1556
    .line 1557
    goto :goto_12

    .line 1558
    :pswitch_b
    iget v1, v0, Lj6/c;->R:I

    .line 1559
    .line 1560
    const/16 v11, 0x8

    .line 1561
    .line 1562
    if-ne v1, v11, :cond_58

    .line 1563
    .line 1564
    move-object/from16 v29, v4

    .line 1565
    .line 1566
    move-object/from16 v11, v35

    .line 1567
    .line 1568
    const/4 v1, 0x3

    .line 1569
    goto :goto_12

    .line 1570
    :cond_58
    const/16 v11, 0x10

    .line 1571
    .line 1572
    if-ne v1, v11, :cond_59

    .line 1573
    .line 1574
    const/high16 v1, 0x10000000

    .line 1575
    .line 1576
    goto :goto_18

    .line 1577
    :cond_59
    const/16 v11, 0x18

    .line 1578
    .line 1579
    if-ne v1, v11, :cond_5a

    .line 1580
    .line 1581
    const/high16 v1, 0x50000000

    .line 1582
    .line 1583
    goto :goto_18

    .line 1584
    :cond_5a
    const/16 v11, 0x20

    .line 1585
    .line 1586
    if-ne v1, v11, :cond_5b

    .line 1587
    .line 1588
    const/high16 v1, 0x60000000

    .line 1589
    .line 1590
    goto :goto_18

    .line 1591
    :cond_5b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1592
    .line 1593
    const-string v11, "Unsupported big endian PCM bit depth: "

    .line 1594
    .line 1595
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1596
    .line 1597
    .line 1598
    iget v11, v0, Lj6/c;->R:I

    .line 1599
    .line 1600
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1601
    .line 1602
    .line 1603
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1604
    .line 1605
    .line 1606
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v1

    .line 1610
    invoke-static {v14, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 1611
    .line 1612
    .line 1613
    goto :goto_16

    .line 1614
    :pswitch_c
    iget v1, v0, Lj6/c;->R:I

    .line 1615
    .line 1616
    const/16 v11, 0x20

    .line 1617
    .line 1618
    if-ne v1, v11, :cond_5c

    .line 1619
    .line 1620
    move-object/from16 v29, v4

    .line 1621
    .line 1622
    move-object/from16 v11, v35

    .line 1623
    .line 1624
    const/4 v1, 0x4

    .line 1625
    goto/16 :goto_12

    .line 1626
    .line 1627
    :cond_5c
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1628
    .line 1629
    const-string v11, "Unsupported floating point PCM bit depth: "

    .line 1630
    .line 1631
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1632
    .line 1633
    .line 1634
    iget v11, v0, Lj6/c;->R:I

    .line 1635
    .line 1636
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1637
    .line 1638
    .line 1639
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v1

    .line 1646
    invoke-static {v14, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 1647
    .line 1648
    .line 1649
    goto :goto_16

    .line 1650
    :pswitch_d
    move-object/from16 v29, v4

    .line 1651
    .line 1652
    move-object v11, v10

    .line 1653
    goto/16 :goto_11

    .line 1654
    .line 1655
    :pswitch_e
    iget-object v1, v0, Lj6/c;->l:[B

    .line 1656
    .line 1657
    if-nez v1, :cond_5d

    .line 1658
    .line 1659
    const/4 v1, 0x0

    .line 1660
    goto :goto_19

    .line 1661
    :cond_5d
    invoke-static {v1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v1

    .line 1665
    :goto_19
    const-string v11, "video/x-vnd.on2.vp9"

    .line 1666
    .line 1667
    goto/16 :goto_d

    .line 1668
    .line 1669
    :pswitch_f
    const-string v11, "video/x-vnd.on2.vp8"

    .line 1670
    .line 1671
    goto/16 :goto_10

    .line 1672
    .line 1673
    :pswitch_10
    iget-object v1, v0, Lj6/c;->l:[B

    .line 1674
    .line 1675
    if-nez v1, :cond_5e

    .line 1676
    .line 1677
    const/4 v1, 0x0

    .line 1678
    goto :goto_1a

    .line 1679
    :cond_5e
    invoke-static {v1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v1

    .line 1683
    :goto_1a
    const-string v11, "video/av01"

    .line 1684
    .line 1685
    goto/16 :goto_d

    .line 1686
    .line 1687
    :pswitch_11
    const-string v11, "audio/vnd.dts"

    .line 1688
    .line 1689
    goto/16 :goto_10

    .line 1690
    .line 1691
    :pswitch_12
    const-string v11, "audio/ac3"

    .line 1692
    .line 1693
    goto/16 :goto_10

    .line 1694
    .line 1695
    :pswitch_13
    invoke-virtual {v0, v1}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1696
    .line 1697
    .line 1698
    move-result-object v1

    .line 1699
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v1

    .line 1703
    iget-object v9, v0, Lj6/c;->l:[B

    .line 1704
    .line 1705
    new-instance v11, Lp4/r;

    .line 1706
    .line 1707
    array-length v14, v9

    .line 1708
    invoke-direct {v11, v9, v14}, Lp4/r;-><init>([BI)V

    .line 1709
    .line 1710
    .line 1711
    const/4 v9, 0x0

    .line 1712
    invoke-static {v11, v9}, Lr5/b;->m(Lp4/r;Z)Lr5/a;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v11

    .line 1716
    iget v9, v11, Lr5/a;->b:I

    .line 1717
    .line 1718
    iput v9, v0, Lj6/c;->S:I

    .line 1719
    .line 1720
    iget v9, v11, Lr5/a;->c:I

    .line 1721
    .line 1722
    iput v9, v0, Lj6/c;->Q:I

    .line 1723
    .line 1724
    iget-object v9, v11, Lr5/a;->a:Ljava/lang/String;

    .line 1725
    .line 1726
    const-string v11, "audio/mp4a-latm"

    .line 1727
    .line 1728
    move-object/from16 v29, v4

    .line 1729
    .line 1730
    move-object v2, v9

    .line 1731
    const/4 v4, -0x1

    .line 1732
    move-object v9, v1

    .line 1733
    const/4 v1, -0x1

    .line 1734
    goto/16 :goto_25

    .line 1735
    .line 1736
    :pswitch_14
    const-string v11, "audio/vnd.dts.hd"

    .line 1737
    .line 1738
    goto/16 :goto_10

    .line 1739
    .line 1740
    :pswitch_15
    invoke-virtual {v0, v1}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1741
    .line 1742
    .line 1743
    move-result-object v1

    .line 1744
    invoke-static {v1}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v1

    .line 1748
    move-object v9, v1

    .line 1749
    move-object/from16 v29, v4

    .line 1750
    .line 1751
    move-object v11, v8

    .line 1752
    goto/16 :goto_e

    .line 1753
    .line 1754
    :pswitch_16
    new-instance v1, Lp4/s;

    .line 1755
    .line 1756
    iget-object v9, v0, Lj6/c;->c:Ljava/lang/String;

    .line 1757
    .line 1758
    invoke-virtual {v0, v9}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1759
    .line 1760
    .line 1761
    move-result-object v9

    .line 1762
    invoke-direct {v1, v9}, Lp4/s;-><init>([B)V

    .line 1763
    .line 1764
    .line 1765
    invoke-static {v1}, Lr5/d;->a(Lp4/s;)Lr5/d;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v1

    .line 1769
    iget-object v9, v1, Lr5/d;->a:Ljava/util/ArrayList;

    .line 1770
    .line 1771
    iget v11, v1, Lr5/d;->b:I

    .line 1772
    .line 1773
    iput v11, v0, Lj6/c;->a0:I

    .line 1774
    .line 1775
    iget-object v1, v1, Lr5/d;->l:Ljava/lang/String;

    .line 1776
    .line 1777
    const-string v11, "video/avc"

    .line 1778
    .line 1779
    goto/16 :goto_14

    .line 1780
    .line 1781
    :pswitch_17
    const/4 v15, 0x4

    .line 1782
    new-array v9, v15, [B

    .line 1783
    .line 1784
    invoke-virtual {v0, v1}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1785
    .line 1786
    .line 1787
    move-result-object v1

    .line 1788
    const/4 v11, 0x0

    .line 1789
    invoke-static {v1, v11, v9, v11, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1790
    .line 1791
    .line 1792
    invoke-static {v9}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    move-object v9, v1

    .line 1797
    move-object/from16 v29, v4

    .line 1798
    .line 1799
    move-object v11, v6

    .line 1800
    goto/16 :goto_e

    .line 1801
    .line 1802
    :pswitch_18
    new-instance v1, Lp4/s;

    .line 1803
    .line 1804
    iget-object v9, v0, Lj6/c;->c:Ljava/lang/String;

    .line 1805
    .line 1806
    invoke-virtual {v0, v9}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1807
    .line 1808
    .line 1809
    move-result-object v9

    .line 1810
    invoke-direct {v1, v9}, Lp4/s;-><init>([B)V

    .line 1811
    .line 1812
    .line 1813
    const/16 v9, 0x10

    .line 1814
    .line 1815
    :try_start_0
    invoke-virtual {v1, v9}, Lp4/s;->H(I)V

    .line 1816
    .line 1817
    .line 1818
    invoke-virtual {v1}, Lp4/s;->l()J

    .line 1819
    .line 1820
    .line 1821
    move-result-wide v18

    .line 1822
    const-wide/32 v22, 0x58564944

    .line 1823
    .line 1824
    .line 1825
    cmp-long v9, v18, v22

    .line 1826
    .line 1827
    if-nez v9, :cond_5f

    .line 1828
    .line 1829
    new-instance v1, Landroid/util/Pair;

    .line 1830
    .line 1831
    const-string v9, "video/divx"
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1832
    .line 1833
    const/4 v11, 0x0

    .line 1834
    :try_start_1
    invoke-direct {v1, v9, v11}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1835
    .line 1836
    .line 1837
    :goto_1b
    const/4 v9, 0x0

    .line 1838
    goto/16 :goto_1d

    .line 1839
    .line 1840
    :catch_0
    move-object v9, v11

    .line 1841
    goto/16 :goto_1e

    .line 1842
    .line 1843
    :catch_1
    const/4 v9, 0x0

    .line 1844
    goto/16 :goto_1e

    .line 1845
    .line 1846
    :cond_5f
    const-wide/32 v22, 0x33363248

    .line 1847
    .line 1848
    .line 1849
    cmp-long v9, v18, v22

    .line 1850
    .line 1851
    if-nez v9, :cond_60

    .line 1852
    .line 1853
    :try_start_2
    new-instance v1, Landroid/util/Pair;

    .line 1854
    .line 1855
    const-string v9, "video/3gpp"
    :try_end_2
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1856
    .line 1857
    const/4 v11, 0x0

    .line 1858
    :try_start_3
    invoke-direct {v1, v9, v11}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_0

    .line 1859
    .line 1860
    .line 1861
    goto :goto_1b

    .line 1862
    :cond_60
    const-wide/32 v22, 0x31435657

    .line 1863
    .line 1864
    .line 1865
    cmp-long v9, v18, v22

    .line 1866
    .line 1867
    if-nez v9, :cond_64

    .line 1868
    .line 1869
    :try_start_4
    iget v9, v1, Lp4/s;->b:I

    .line 1870
    .line 1871
    add-int/lit8 v9, v9, 0x14

    .line 1872
    .line 1873
    iget-object v1, v1, Lp4/s;->a:[B

    .line 1874
    .line 1875
    :goto_1c
    array-length v11, v1

    .line 1876
    const/4 v15, 0x4

    .line 1877
    sub-int/2addr v11, v15

    .line 1878
    if-ge v9, v11, :cond_63

    .line 1879
    .line 1880
    aget-byte v11, v1, v9

    .line 1881
    .line 1882
    if-nez v11, :cond_61

    .line 1883
    .line 1884
    add-int/lit8 v11, v9, 0x1

    .line 1885
    .line 1886
    aget-byte v11, v1, v11

    .line 1887
    .line 1888
    if-nez v11, :cond_61

    .line 1889
    .line 1890
    add-int/lit8 v11, v9, 0x2

    .line 1891
    .line 1892
    aget-byte v11, v1, v11

    .line 1893
    .line 1894
    const/4 v14, 0x1

    .line 1895
    if-ne v11, v14, :cond_61

    .line 1896
    .line 1897
    add-int/lit8 v11, v9, 0x3

    .line 1898
    .line 1899
    aget-byte v11, v1, v11

    .line 1900
    .line 1901
    const/16 v14, 0xf

    .line 1902
    .line 1903
    if-ne v11, v14, :cond_62

    .line 1904
    .line 1905
    array-length v11, v1

    .line 1906
    invoke-static {v1, v9, v11}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 1907
    .line 1908
    .line 1909
    move-result-object v1

    .line 1910
    new-instance v9, Landroid/util/Pair;

    .line 1911
    .line 1912
    const-string v11, "video/wvc1"

    .line 1913
    .line 1914
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v1

    .line 1918
    invoke-direct {v9, v11, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1919
    .line 1920
    .line 1921
    move-object v1, v9

    .line 1922
    goto :goto_1b

    .line 1923
    :cond_61
    const/16 v14, 0xf

    .line 1924
    .line 1925
    :cond_62
    add-int/lit8 v9, v9, 0x1

    .line 1926
    .line 1927
    goto :goto_1c

    .line 1928
    :cond_63
    const-string v0, "Failed to find FourCC VC1 initialization data"
    :try_end_4
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_1

    .line 1929
    .line 1930
    const/4 v1, 0x0

    .line 1931
    :try_start_5
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_2

    .line 1935
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_1

    .line 1936
    :catch_2
    move-object v9, v1

    .line 1937
    goto :goto_1e

    .line 1938
    :cond_64
    const-string v1, "Unknown FourCC. Setting mimeType to video/x-unknown"

    .line 1939
    .line 1940
    invoke-static {v14, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 1941
    .line 1942
    .line 1943
    new-instance v1, Landroid/util/Pair;

    .line 1944
    .line 1945
    const/4 v9, 0x0

    .line 1946
    invoke-direct {v1, v11, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1947
    .line 1948
    .line 1949
    :goto_1d
    iget-object v11, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1950
    .line 1951
    check-cast v11, Ljava/lang/String;

    .line 1952
    .line 1953
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1954
    .line 1955
    move-object/from16 v26, v1

    .line 1956
    .line 1957
    check-cast v26, Ljava/util/List;

    .line 1958
    .line 1959
    move-object/from16 v29, v4

    .line 1960
    .line 1961
    move-object v2, v9

    .line 1962
    move-object/from16 v9, v26

    .line 1963
    .line 1964
    goto/16 :goto_15

    .line 1965
    .line 1966
    :goto_1e
    const-string v0, "Error parsing FourCC private data"

    .line 1967
    .line 1968
    invoke-static {v9, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v0

    .line 1972
    throw v0

    .line 1973
    :pswitch_19
    const-string v11, "audio/mpeg"

    .line 1974
    .line 1975
    :goto_1f
    move-object/from16 v29, v4

    .line 1976
    .line 1977
    const/4 v1, -0x1

    .line 1978
    const/4 v2, 0x0

    .line 1979
    const/16 v4, 0x1000

    .line 1980
    .line 1981
    goto/16 :goto_13

    .line 1982
    .line 1983
    :pswitch_1a
    const-string v11, "audio/mpeg-L2"

    .line 1984
    .line 1985
    goto :goto_1f

    .line 1986
    :pswitch_1b
    invoke-virtual {v0, v1}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 1987
    .line 1988
    .line 1989
    move-result-object v1

    .line 1990
    const-string v9, "Error parsing vorbis codec private"

    .line 1991
    .line 1992
    const/16 v24, 0x0

    .line 1993
    .line 1994
    :try_start_7
    aget-byte v11, v1, v24

    .line 1995
    .line 1996
    const/4 v14, 0x2

    .line 1997
    if-ne v11, v14, :cond_6a

    .line 1998
    .line 1999
    const/4 v11, 0x0

    .line 2000
    const/4 v14, 0x1

    .line 2001
    :goto_20
    aget-byte v15, v1, v14

    .line 2002
    .line 2003
    move/from16 v17, v14

    .line 2004
    .line 2005
    const/16 v14, 0xff

    .line 2006
    .line 2007
    and-int/2addr v15, v14

    .line 2008
    if-ne v15, v14, :cond_65

    .line 2009
    .line 2010
    add-int/lit16 v11, v11, 0xff

    .line 2011
    .line 2012
    add-int/lit8 v14, v17, 0x1

    .line 2013
    .line 2014
    goto :goto_20

    .line 2015
    :cond_65
    add-int/lit8 v17, v17, 0x1

    .line 2016
    .line 2017
    add-int/2addr v11, v15

    .line 2018
    const/4 v15, 0x0

    .line 2019
    :goto_21
    aget-byte v2, v1, v17

    .line 2020
    .line 2021
    and-int/2addr v2, v14

    .line 2022
    if-ne v2, v14, :cond_66

    .line 2023
    .line 2024
    add-int/lit16 v15, v15, 0xff

    .line 2025
    .line 2026
    add-int/lit8 v17, v17, 0x1

    .line 2027
    .line 2028
    goto :goto_21

    .line 2029
    :cond_66
    add-int/lit8 v14, v17, 0x1

    .line 2030
    .line 2031
    add-int/2addr v15, v2

    .line 2032
    aget-byte v2, v1, v14

    .line 2033
    .line 2034
    move/from16 v17, v15

    .line 2035
    .line 2036
    const/4 v15, 0x1

    .line 2037
    if-ne v2, v15, :cond_69

    .line 2038
    .line 2039
    new-array v2, v11, [B

    .line 2040
    .line 2041
    const/4 v15, 0x0

    .line 2042
    invoke-static {v1, v14, v2, v15, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2043
    .line 2044
    .line 2045
    add-int/2addr v14, v11

    .line 2046
    aget-byte v11, v1, v14

    .line 2047
    .line 2048
    const/4 v15, 0x3

    .line 2049
    if-ne v11, v15, :cond_68

    .line 2050
    .line 2051
    add-int v14, v14, v17

    .line 2052
    .line 2053
    aget-byte v11, v1, v14

    .line 2054
    .line 2055
    const/4 v15, 0x5

    .line 2056
    if-ne v11, v15, :cond_67

    .line 2057
    .line 2058
    array-length v11, v1

    .line 2059
    sub-int/2addr v11, v14

    .line 2060
    new-array v11, v11, [B

    .line 2061
    .line 2062
    array-length v15, v1

    .line 2063
    sub-int/2addr v15, v14

    .line 2064
    move-object/from16 v29, v4

    .line 2065
    .line 2066
    const/4 v4, 0x0

    .line 2067
    invoke-static {v1, v14, v11, v4, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2068
    .line 2069
    .line 2070
    new-instance v1, Ljava/util/ArrayList;

    .line 2071
    .line 2072
    const/4 v14, 0x2

    .line 2073
    invoke-direct {v1, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 2074
    .line 2075
    .line 2076
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2077
    .line 2078
    .line 2079
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_3

    .line 2080
    .line 2081
    .line 2082
    const-string v11, "audio/vorbis"

    .line 2083
    .line 2084
    const/16 v2, 0x2000

    .line 2085
    .line 2086
    move-object v9, v1

    .line 2087
    const/4 v1, -0x1

    .line 2088
    const/4 v2, 0x0

    .line 2089
    const/16 v4, 0x2000

    .line 2090
    .line 2091
    goto/16 :goto_25

    .line 2092
    .line 2093
    :catch_3
    const/4 v1, 0x0

    .line 2094
    goto :goto_22

    .line 2095
    :cond_67
    const/4 v1, 0x0

    .line 2096
    :try_start_8
    invoke-static {v1, v9}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v0

    .line 2100
    throw v0

    .line 2101
    :cond_68
    const/4 v1, 0x0

    .line 2102
    invoke-static {v1, v9}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0

    .line 2106
    throw v0

    .line 2107
    :cond_69
    const/4 v1, 0x0

    .line 2108
    invoke-static {v1, v9}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v0

    .line 2112
    throw v0

    .line 2113
    :cond_6a
    const/4 v1, 0x0

    .line 2114
    invoke-static {v1, v9}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v0

    .line 2118
    throw v0
    :try_end_8
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_4

    .line 2119
    :catch_4
    :goto_22
    invoke-static {v1, v9}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v0

    .line 2123
    throw v0

    .line 2124
    :pswitch_1c
    move-object/from16 v29, v4

    .line 2125
    .line 2126
    new-instance v1, Lr5/i0;

    .line 2127
    .line 2128
    invoke-direct {v1}, Lr5/i0;-><init>()V

    .line 2129
    .line 2130
    .line 2131
    iput-object v1, v0, Lj6/c;->V:Lr5/i0;

    .line 2132
    .line 2133
    const-string v11, "audio/true-hd"

    .line 2134
    .line 2135
    goto/16 :goto_11

    .line 2136
    .line 2137
    :pswitch_1d
    move-object/from16 v29, v4

    .line 2138
    .line 2139
    new-instance v1, Lp4/s;

    .line 2140
    .line 2141
    iget-object v2, v0, Lj6/c;->c:Ljava/lang/String;

    .line 2142
    .line 2143
    invoke-virtual {v0, v2}, Lj6/c;->a(Ljava/lang/String;)[B

    .line 2144
    .line 2145
    .line 2146
    move-result-object v2

    .line 2147
    invoke-direct {v1, v2}, Lp4/s;-><init>([B)V

    .line 2148
    .line 2149
    .line 2150
    :try_start_9
    invoke-virtual {v1}, Lp4/s;->n()I

    .line 2151
    .line 2152
    .line 2153
    move-result v2

    .line 2154
    const/4 v15, 0x1

    .line 2155
    if-ne v2, v15, :cond_6b

    .line 2156
    .line 2157
    goto :goto_23

    .line 2158
    :cond_6b
    const v4, 0xfffe

    .line 2159
    .line 2160
    .line 2161
    if-ne v2, v4, :cond_6c

    .line 2162
    .line 2163
    const/16 v11, 0x18

    .line 2164
    .line 2165
    invoke-virtual {v1, v11}, Lp4/s;->G(I)V

    .line 2166
    .line 2167
    .line 2168
    invoke-virtual {v1}, Lp4/s;->o()J

    .line 2169
    .line 2170
    .line 2171
    move-result-wide v17

    .line 2172
    sget-object v2, Lj6/d;->j0:Ljava/util/UUID;

    .line 2173
    .line 2174
    invoke-virtual {v2}, Ljava/util/UUID;->getMostSignificantBits()J

    .line 2175
    .line 2176
    .line 2177
    move-result-wide v22

    .line 2178
    cmp-long v4, v17, v22

    .line 2179
    .line 2180
    if-nez v4, :cond_6c

    .line 2181
    .line 2182
    invoke-virtual {v1}, Lp4/s;->o()J

    .line 2183
    .line 2184
    .line 2185
    move-result-wide v17

    .line 2186
    invoke-virtual {v2}, Ljava/util/UUID;->getLeastSignificantBits()J

    .line 2187
    .line 2188
    .line 2189
    move-result-wide v1
    :try_end_9
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_9 .. :try_end_9} :catch_5

    .line 2190
    cmp-long v4, v17, v1

    .line 2191
    .line 2192
    if-nez v4, :cond_6c

    .line 2193
    .line 2194
    :goto_23
    iget v1, v0, Lj6/c;->R:I

    .line 2195
    .line 2196
    invoke-static {v1}, Lp4/c0;->A(I)I

    .line 2197
    .line 2198
    .line 2199
    move-result v1

    .line 2200
    if-nez v1, :cond_57

    .line 2201
    .line 2202
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2203
    .line 2204
    const-string v2, "Unsupported PCM bit depth: "

    .line 2205
    .line 2206
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2207
    .line 2208
    .line 2209
    iget v2, v0, Lj6/c;->R:I

    .line 2210
    .line 2211
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2212
    .line 2213
    .line 2214
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2215
    .line 2216
    .line 2217
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v1

    .line 2221
    invoke-static {v14, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 2222
    .line 2223
    .line 2224
    goto/16 :goto_17

    .line 2225
    .line 2226
    :cond_6c
    const-string v1, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown"

    .line 2227
    .line 2228
    invoke-static {v14, v1}, Lp4/c;->B(Ljava/lang/String;Ljava/lang/String;)V

    .line 2229
    .line 2230
    .line 2231
    goto/16 :goto_17

    .line 2232
    .line 2233
    :catch_5
    const-string v0, "Error parsing MS/ACM codec private"

    .line 2234
    .line 2235
    const/4 v1, 0x0

    .line 2236
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v0

    .line 2240
    throw v0

    .line 2241
    :pswitch_1e
    move-object/from16 v29, v4

    .line 2242
    .line 2243
    iget-object v1, v0, Lj6/c;->l:[B

    .line 2244
    .line 2245
    if-nez v1, :cond_6d

    .line 2246
    .line 2247
    const/4 v1, 0x0

    .line 2248
    goto :goto_24

    .line 2249
    :cond_6d
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v1

    .line 2253
    :goto_24
    const-string v11, "video/mp4v-es"

    .line 2254
    .line 2255
    move-object v9, v1

    .line 2256
    goto/16 :goto_e

    .line 2257
    .line 2258
    :goto_25
    iget-object v14, v0, Lj6/c;->P:[B

    .line 2259
    .line 2260
    if-eqz v14, :cond_6e

    .line 2261
    .line 2262
    new-instance v14, Lp4/s;

    .line 2263
    .line 2264
    iget-object v15, v0, Lj6/c;->P:[B

    .line 2265
    .line 2266
    invoke-direct {v14, v15}, Lp4/s;-><init>([B)V

    .line 2267
    .line 2268
    .line 2269
    invoke-static {v14}, Lapp/nekogram/translator/r;->b(Lp4/s;)Lapp/nekogram/translator/r;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v14

    .line 2273
    if-eqz v14, :cond_6e

    .line 2274
    .line 2275
    iget-object v2, v14, Lapp/nekogram/translator/r;->b:Ljava/lang/String;

    .line 2276
    .line 2277
    const-string v11, "video/dolby-vision"

    .line 2278
    .line 2279
    :cond_6e
    iget-boolean v14, v0, Lj6/c;->X:Z

    .line 2280
    .line 2281
    iget-boolean v15, v0, Lj6/c;->W:Z

    .line 2282
    .line 2283
    if-eqz v15, :cond_6f

    .line 2284
    .line 2285
    const/4 v15, 0x2

    .line 2286
    goto :goto_26

    .line 2287
    :cond_6f
    const/4 v15, 0x0

    .line 2288
    :goto_26
    or-int/2addr v14, v15

    .line 2289
    new-instance v15, Lm4/p;

    .line 2290
    .line 2291
    invoke-direct {v15}, Lm4/p;-><init>()V

    .line 2292
    .line 2293
    .line 2294
    invoke-static {v11}, Lm4/o0;->k(Ljava/lang/String;)Z

    .line 2295
    .line 2296
    .line 2297
    move-result v17

    .line 2298
    move-object/from16 v22, v7

    .line 2299
    .line 2300
    sget-object v7, Lj6/d;->k0:Ljava/util/Map;

    .line 2301
    .line 2302
    if-eqz v17, :cond_70

    .line 2303
    .line 2304
    iget v5, v0, Lj6/c;->Q:I

    .line 2305
    .line 2306
    iput v5, v15, Lm4/p;->C:I

    .line 2307
    .line 2308
    iget v5, v0, Lj6/c;->S:I

    .line 2309
    .line 2310
    iput v5, v15, Lm4/p;->D:I

    .line 2311
    .line 2312
    iput v1, v15, Lm4/p;->E:I

    .line 2313
    .line 2314
    const/4 v1, 0x1

    .line 2315
    goto/16 :goto_30

    .line 2316
    .line 2317
    :cond_70
    invoke-static {v11}, Lm4/o0;->o(Ljava/lang/String;)Z

    .line 2318
    .line 2319
    .line 2320
    move-result v1

    .line 2321
    if-eqz v1, :cond_7e

    .line 2322
    .line 2323
    iget v1, v0, Lj6/c;->s:I

    .line 2324
    .line 2325
    if-nez v1, :cond_73

    .line 2326
    .line 2327
    iget v1, v0, Lj6/c;->q:I

    .line 2328
    .line 2329
    const/4 v5, -0x1

    .line 2330
    if-ne v1, v5, :cond_71

    .line 2331
    .line 2332
    iget v1, v0, Lj6/c;->n:I

    .line 2333
    .line 2334
    :cond_71
    iput v1, v0, Lj6/c;->q:I

    .line 2335
    .line 2336
    iget v1, v0, Lj6/c;->r:I

    .line 2337
    .line 2338
    if-ne v1, v5, :cond_72

    .line 2339
    .line 2340
    iget v1, v0, Lj6/c;->o:I

    .line 2341
    .line 2342
    :cond_72
    iput v1, v0, Lj6/c;->r:I

    .line 2343
    .line 2344
    goto :goto_27

    .line 2345
    :cond_73
    const/4 v5, -0x1

    .line 2346
    :goto_27
    iget v1, v0, Lj6/c;->q:I

    .line 2347
    .line 2348
    if-eq v1, v5, :cond_74

    .line 2349
    .line 2350
    iget v6, v0, Lj6/c;->r:I

    .line 2351
    .line 2352
    if-eq v6, v5, :cond_74

    .line 2353
    .line 2354
    iget v5, v0, Lj6/c;->o:I

    .line 2355
    .line 2356
    mul-int v5, v5, v1

    .line 2357
    .line 2358
    int-to-float v1, v5

    .line 2359
    iget v5, v0, Lj6/c;->n:I

    .line 2360
    .line 2361
    mul-int v5, v5, v6

    .line 2362
    .line 2363
    int-to-float v5, v5

    .line 2364
    div-float/2addr v1, v5

    .line 2365
    goto :goto_28

    .line 2366
    :cond_74
    const/high16 v1, -0x40800000    # -1.0f

    .line 2367
    .line 2368
    :goto_28
    iget-boolean v5, v0, Lj6/c;->z:Z

    .line 2369
    .line 2370
    if-eqz v5, :cond_77

    .line 2371
    .line 2372
    iget v5, v0, Lj6/c;->F:F

    .line 2373
    .line 2374
    cmpl-float v5, v5, v25

    .line 2375
    .line 2376
    if-eqz v5, :cond_76

    .line 2377
    .line 2378
    iget v5, v0, Lj6/c;->G:F

    .line 2379
    .line 2380
    cmpl-float v5, v5, v25

    .line 2381
    .line 2382
    if-eqz v5, :cond_76

    .line 2383
    .line 2384
    iget v5, v0, Lj6/c;->H:F

    .line 2385
    .line 2386
    cmpl-float v5, v5, v25

    .line 2387
    .line 2388
    if-eqz v5, :cond_76

    .line 2389
    .line 2390
    iget v5, v0, Lj6/c;->I:F

    .line 2391
    .line 2392
    cmpl-float v5, v5, v25

    .line 2393
    .line 2394
    if-eqz v5, :cond_76

    .line 2395
    .line 2396
    iget v5, v0, Lj6/c;->J:F

    .line 2397
    .line 2398
    cmpl-float v5, v5, v25

    .line 2399
    .line 2400
    if-eqz v5, :cond_76

    .line 2401
    .line 2402
    iget v5, v0, Lj6/c;->K:F

    .line 2403
    .line 2404
    cmpl-float v5, v5, v25

    .line 2405
    .line 2406
    if-eqz v5, :cond_76

    .line 2407
    .line 2408
    iget v5, v0, Lj6/c;->L:F

    .line 2409
    .line 2410
    cmpl-float v5, v5, v25

    .line 2411
    .line 2412
    if-eqz v5, :cond_76

    .line 2413
    .line 2414
    iget v5, v0, Lj6/c;->M:F

    .line 2415
    .line 2416
    cmpl-float v5, v5, v25

    .line 2417
    .line 2418
    if-eqz v5, :cond_76

    .line 2419
    .line 2420
    iget v5, v0, Lj6/c;->N:F

    .line 2421
    .line 2422
    cmpl-float v5, v5, v25

    .line 2423
    .line 2424
    if-eqz v5, :cond_76

    .line 2425
    .line 2426
    iget v5, v0, Lj6/c;->O:F

    .line 2427
    .line 2428
    cmpl-float v5, v5, v25

    .line 2429
    .line 2430
    if-nez v5, :cond_75

    .line 2431
    .line 2432
    goto/16 :goto_29

    .line 2433
    .line 2434
    :cond_75
    const/16 v5, 0x19

    .line 2435
    .line 2436
    new-array v5, v5, [B

    .line 2437
    .line 2438
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 2439
    .line 2440
    .line 2441
    move-result-object v6

    .line 2442
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2443
    .line 2444
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v6

    .line 2448
    const/4 v8, 0x0

    .line 2449
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 2450
    .line 2451
    .line 2452
    iget v8, v0, Lj6/c;->F:F

    .line 2453
    .line 2454
    const v10, 0x47435000    # 50000.0f

    .line 2455
    .line 2456
    .line 2457
    mul-float v8, v8, v10

    .line 2458
    .line 2459
    const/high16 v12, 0x3f000000    # 0.5f

    .line 2460
    .line 2461
    add-float/2addr v8, v12

    .line 2462
    float-to-int v8, v8

    .line 2463
    int-to-short v8, v8

    .line 2464
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2465
    .line 2466
    .line 2467
    iget v8, v0, Lj6/c;->G:F

    .line 2468
    .line 2469
    mul-float v8, v8, v10

    .line 2470
    .line 2471
    add-float/2addr v8, v12

    .line 2472
    float-to-int v8, v8

    .line 2473
    int-to-short v8, v8

    .line 2474
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2475
    .line 2476
    .line 2477
    iget v8, v0, Lj6/c;->H:F

    .line 2478
    .line 2479
    mul-float v8, v8, v10

    .line 2480
    .line 2481
    add-float/2addr v8, v12

    .line 2482
    float-to-int v8, v8

    .line 2483
    int-to-short v8, v8

    .line 2484
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2485
    .line 2486
    .line 2487
    iget v8, v0, Lj6/c;->I:F

    .line 2488
    .line 2489
    mul-float v8, v8, v10

    .line 2490
    .line 2491
    add-float/2addr v8, v12

    .line 2492
    float-to-int v8, v8

    .line 2493
    int-to-short v8, v8

    .line 2494
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2495
    .line 2496
    .line 2497
    iget v8, v0, Lj6/c;->J:F

    .line 2498
    .line 2499
    mul-float v8, v8, v10

    .line 2500
    .line 2501
    add-float/2addr v8, v12

    .line 2502
    float-to-int v8, v8

    .line 2503
    int-to-short v8, v8

    .line 2504
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2505
    .line 2506
    .line 2507
    iget v8, v0, Lj6/c;->K:F

    .line 2508
    .line 2509
    mul-float v8, v8, v10

    .line 2510
    .line 2511
    add-float/2addr v8, v12

    .line 2512
    float-to-int v8, v8

    .line 2513
    int-to-short v8, v8

    .line 2514
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2515
    .line 2516
    .line 2517
    iget v8, v0, Lj6/c;->L:F

    .line 2518
    .line 2519
    mul-float v8, v8, v10

    .line 2520
    .line 2521
    add-float/2addr v8, v12

    .line 2522
    float-to-int v8, v8

    .line 2523
    int-to-short v8, v8

    .line 2524
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2525
    .line 2526
    .line 2527
    iget v8, v0, Lj6/c;->M:F

    .line 2528
    .line 2529
    mul-float v8, v8, v10

    .line 2530
    .line 2531
    add-float/2addr v8, v12

    .line 2532
    float-to-int v8, v8

    .line 2533
    int-to-short v8, v8

    .line 2534
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2535
    .line 2536
    .line 2537
    iget v8, v0, Lj6/c;->N:F

    .line 2538
    .line 2539
    add-float/2addr v8, v12

    .line 2540
    float-to-int v8, v8

    .line 2541
    int-to-short v8, v8

    .line 2542
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2543
    .line 2544
    .line 2545
    iget v8, v0, Lj6/c;->O:F

    .line 2546
    .line 2547
    add-float/2addr v8, v12

    .line 2548
    float-to-int v8, v8

    .line 2549
    int-to-short v8, v8

    .line 2550
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2551
    .line 2552
    .line 2553
    iget v8, v0, Lj6/c;->D:I

    .line 2554
    .line 2555
    int-to-short v8, v8

    .line 2556
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2557
    .line 2558
    .line 2559
    iget v8, v0, Lj6/c;->E:I

    .line 2560
    .line 2561
    int-to-short v8, v8

    .line 2562
    invoke-virtual {v6, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 2563
    .line 2564
    .line 2565
    move-object/from16 v39, v5

    .line 2566
    .line 2567
    goto :goto_2a

    .line 2568
    :cond_76
    :goto_29
    const/16 v39, 0x0

    .line 2569
    .line 2570
    :goto_2a
    iget v5, v0, Lj6/c;->A:I

    .line 2571
    .line 2572
    iget v6, v0, Lj6/c;->C:I

    .line 2573
    .line 2574
    iget v8, v0, Lj6/c;->B:I

    .line 2575
    .line 2576
    iget v10, v0, Lj6/c;->p:I

    .line 2577
    .line 2578
    new-instance v35, Lm4/h;

    .line 2579
    .line 2580
    move/from16 v41, v10

    .line 2581
    .line 2582
    move/from16 v36, v5

    .line 2583
    .line 2584
    move/from16 v37, v6

    .line 2585
    .line 2586
    move/from16 v38, v8

    .line 2587
    .line 2588
    move/from16 v40, v10

    .line 2589
    .line 2590
    invoke-direct/range {v35 .. v41}, Lm4/h;-><init>(III[BII)V

    .line 2591
    .line 2592
    .line 2593
    move-object/from16 v5, v35

    .line 2594
    .line 2595
    goto :goto_2b

    .line 2596
    :cond_77
    const/4 v5, 0x0

    .line 2597
    :goto_2b
    iget-object v6, v0, Lj6/c;->b:Ljava/lang/String;

    .line 2598
    .line 2599
    if-eqz v6, :cond_78

    .line 2600
    .line 2601
    invoke-interface {v7, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2602
    .line 2603
    .line 2604
    move-result v6

    .line 2605
    if-eqz v6, :cond_78

    .line 2606
    .line 2607
    iget-object v6, v0, Lj6/c;->b:Ljava/lang/String;

    .line 2608
    .line 2609
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2610
    .line 2611
    .line 2612
    move-result-object v6

    .line 2613
    check-cast v6, Ljava/lang/Integer;

    .line 2614
    .line 2615
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 2616
    .line 2617
    .line 2618
    move-result v6

    .line 2619
    goto :goto_2c

    .line 2620
    :cond_78
    const/4 v6, -0x1

    .line 2621
    :goto_2c
    iget v8, v0, Lj6/c;->t:I

    .line 2622
    .line 2623
    if-nez v8, :cond_7d

    .line 2624
    .line 2625
    iget v8, v0, Lj6/c;->u:F

    .line 2626
    .line 2627
    const/4 v10, 0x0

    .line 2628
    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    .line 2629
    .line 2630
    .line 2631
    move-result v8

    .line 2632
    if-nez v8, :cond_7d

    .line 2633
    .line 2634
    iget v8, v0, Lj6/c;->v:F

    .line 2635
    .line 2636
    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    .line 2637
    .line 2638
    .line 2639
    move-result v8

    .line 2640
    if-nez v8, :cond_7d

    .line 2641
    .line 2642
    iget v8, v0, Lj6/c;->w:F

    .line 2643
    .line 2644
    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    .line 2645
    .line 2646
    .line 2647
    move-result v8

    .line 2648
    if-nez v8, :cond_79

    .line 2649
    .line 2650
    const/4 v6, 0x0

    .line 2651
    goto :goto_2e

    .line 2652
    :cond_79
    iget v8, v0, Lj6/c;->w:F

    .line 2653
    .line 2654
    const/high16 v10, 0x42b40000    # 90.0f

    .line 2655
    .line 2656
    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    .line 2657
    .line 2658
    .line 2659
    move-result v8

    .line 2660
    if-nez v8, :cond_7a

    .line 2661
    .line 2662
    const/16 v6, 0x5a

    .line 2663
    .line 2664
    goto :goto_2e

    .line 2665
    :cond_7a
    iget v8, v0, Lj6/c;->w:F

    .line 2666
    .line 2667
    const/high16 v10, -0x3ccc0000    # -180.0f

    .line 2668
    .line 2669
    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    .line 2670
    .line 2671
    .line 2672
    move-result v8

    .line 2673
    if-eqz v8, :cond_7c

    .line 2674
    .line 2675
    iget v8, v0, Lj6/c;->w:F

    .line 2676
    .line 2677
    const/high16 v10, 0x43340000    # 180.0f

    .line 2678
    .line 2679
    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    .line 2680
    .line 2681
    .line 2682
    move-result v8

    .line 2683
    if-nez v8, :cond_7b

    .line 2684
    .line 2685
    goto :goto_2d

    .line 2686
    :cond_7b
    iget v8, v0, Lj6/c;->w:F

    .line 2687
    .line 2688
    const/high16 v10, -0x3d4c0000    # -90.0f

    .line 2689
    .line 2690
    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    .line 2691
    .line 2692
    .line 2693
    move-result v8

    .line 2694
    if-nez v8, :cond_7d

    .line 2695
    .line 2696
    const/16 v6, 0x10e

    .line 2697
    .line 2698
    goto :goto_2e

    .line 2699
    :cond_7c
    :goto_2d
    const/16 v6, 0xb4

    .line 2700
    .line 2701
    :cond_7d
    :goto_2e
    iget v8, v0, Lj6/c;->n:I

    .line 2702
    .line 2703
    iput v8, v15, Lm4/p;->t:I

    .line 2704
    .line 2705
    iget v8, v0, Lj6/c;->o:I

    .line 2706
    .line 2707
    iput v8, v15, Lm4/p;->u:I

    .line 2708
    .line 2709
    iput v1, v15, Lm4/p;->x:F

    .line 2710
    .line 2711
    iput v6, v15, Lm4/p;->w:I

    .line 2712
    .line 2713
    iget-object v1, v0, Lj6/c;->x:[B

    .line 2714
    .line 2715
    iput-object v1, v15, Lm4/p;->y:[B

    .line 2716
    .line 2717
    iget v1, v0, Lj6/c;->y:I

    .line 2718
    .line 2719
    iput v1, v15, Lm4/p;->z:I

    .line 2720
    .line 2721
    iput-object v5, v15, Lm4/p;->A:Lm4/h;

    .line 2722
    .line 2723
    const/4 v1, 0x2

    .line 2724
    goto :goto_30

    .line 2725
    :cond_7e
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2726
    .line 2727
    .line 2728
    move-result v1

    .line 2729
    if-nez v1, :cond_80

    .line 2730
    .line 2731
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2732
    .line 2733
    .line 2734
    move-result v1

    .line 2735
    if-nez v1, :cond_80

    .line 2736
    .line 2737
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2738
    .line 2739
    .line 2740
    move-result v1

    .line 2741
    if-nez v1, :cond_80

    .line 2742
    .line 2743
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2744
    .line 2745
    .line 2746
    move-result v1

    .line 2747
    if-nez v1, :cond_80

    .line 2748
    .line 2749
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2750
    .line 2751
    .line 2752
    move-result v1

    .line 2753
    if-nez v1, :cond_80

    .line 2754
    .line 2755
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2756
    .line 2757
    .line 2758
    move-result v1

    .line 2759
    if-eqz v1, :cond_7f

    .line 2760
    .line 2761
    goto :goto_2f

    .line 2762
    :cond_7f
    const-string v0, "Unexpected MIME type."

    .line 2763
    .line 2764
    const/4 v1, 0x0

    .line 2765
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2766
    .line 2767
    .line 2768
    move-result-object v0

    .line 2769
    throw v0

    .line 2770
    :cond_80
    :goto_2f
    const/4 v1, 0x3

    .line 2771
    :goto_30
    iget-object v5, v0, Lj6/c;->b:Ljava/lang/String;

    .line 2772
    .line 2773
    if-eqz v5, :cond_81

    .line 2774
    .line 2775
    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 2776
    .line 2777
    .line 2778
    move-result v5

    .line 2779
    if-nez v5, :cond_81

    .line 2780
    .line 2781
    iget-object v5, v0, Lj6/c;->b:Ljava/lang/String;

    .line 2782
    .line 2783
    iput-object v5, v15, Lm4/p;->b:Ljava/lang/String;

    .line 2784
    .line 2785
    :cond_81
    invoke-static/range {v34 .. v34}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2786
    .line 2787
    .line 2788
    move-result-object v5

    .line 2789
    iput-object v5, v15, Lm4/p;->a:Ljava/lang/String;

    .line 2790
    .line 2791
    iget-boolean v5, v0, Lj6/c;->a:Z

    .line 2792
    .line 2793
    if-eqz v5, :cond_82

    .line 2794
    .line 2795
    goto :goto_31

    .line 2796
    :cond_82
    const-string v5, "video/x-matroska"

    .line 2797
    .line 2798
    move-object/from16 v32, v5

    .line 2799
    .line 2800
    :goto_31
    invoke-static/range {v32 .. v32}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 2801
    .line 2802
    .line 2803
    move-result-object v5

    .line 2804
    iput-object v5, v15, Lm4/p;->l:Ljava/lang/String;

    .line 2805
    .line 2806
    invoke-static {v11}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v5

    .line 2810
    iput-object v5, v15, Lm4/p;->m:Ljava/lang/String;

    .line 2811
    .line 2812
    iput v4, v15, Lm4/p;->n:I

    .line 2813
    .line 2814
    iget-object v4, v0, Lj6/c;->Y:Ljava/lang/String;

    .line 2815
    .line 2816
    iput-object v4, v15, Lm4/p;->d:Ljava/lang/String;

    .line 2817
    .line 2818
    iput v14, v15, Lm4/p;->e:I

    .line 2819
    .line 2820
    iput-object v9, v15, Lm4/p;->p:Ljava/util/List;

    .line 2821
    .line 2822
    iput-object v2, v15, Lm4/p;->j:Ljava/lang/String;

    .line 2823
    .line 2824
    iget-object v2, v0, Lj6/c;->m:Lm4/n;

    .line 2825
    .line 2826
    iput-object v2, v15, Lm4/p;->q:Lm4/n;

    .line 2827
    .line 2828
    new-instance v2, Lm4/q;

    .line 2829
    .line 2830
    invoke-direct {v2, v15}, Lm4/q;-><init>(Lm4/p;)V

    .line 2831
    .line 2832
    .line 2833
    iget v4, v0, Lj6/c;->d:I

    .line 2834
    .line 2835
    invoke-interface {v3, v4, v1}, Lr5/q;->u(II)Lr5/h0;

    .line 2836
    .line 2837
    .line 2838
    move-result-object v1

    .line 2839
    iput-object v1, v0, Lj6/c;->Z:Lr5/h0;

    .line 2840
    .line 2841
    invoke-interface {v1, v2}, Lr5/h0;->b(Lm4/q;)V

    .line 2842
    .line 2843
    .line 2844
    iget v1, v0, Lj6/c;->d:I

    .line 2845
    .line 2846
    move-object/from16 v2, v22

    .line 2847
    .line 2848
    invoke-virtual {v2, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 2849
    .line 2850
    .line 2851
    move-object/from16 v4, v29

    .line 2852
    .line 2853
    goto/16 :goto_a

    .line 2854
    .line 2855
    :goto_32
    iput-object v1, v4, Lj6/d;->x:Lj6/c;

    .line 2856
    .line 2857
    goto/16 :goto_7

    .line 2858
    .line 2859
    :cond_83
    const/4 v1, 0x0

    .line 2860
    const-string v0, "CodecId is missing in TrackEntry element"

    .line 2861
    .line 2862
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v0

    .line 2866
    throw v0

    .line 2867
    :cond_84
    move-object v2, v7

    .line 2868
    iget v0, v4, Lj6/d;->J:I

    .line 2869
    .line 2870
    const/4 v14, 0x2

    .line 2871
    if-eq v0, v14, :cond_85

    .line 2872
    .line 2873
    :goto_33
    goto/16 :goto_7

    .line 2874
    .line 2875
    :cond_85
    iget v0, v4, Lj6/d;->P:I

    .line 2876
    .line 2877
    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 2878
    .line 2879
    .line 2880
    move-result-object v0

    .line 2881
    check-cast v0, Lj6/c;

    .line 2882
    .line 2883
    iget-object v1, v0, Lj6/c;->Z:Lr5/h0;

    .line 2884
    .line 2885
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2886
    .line 2887
    .line 2888
    iget-wide v1, v4, Lj6/d;->U:J

    .line 2889
    .line 2890
    cmp-long v3, v1, v17

    .line 2891
    .line 2892
    if-lez v3, :cond_86

    .line 2893
    .line 2894
    iget-object v1, v0, Lj6/c;->c:Ljava/lang/String;

    .line 2895
    .line 2896
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2897
    .line 2898
    .line 2899
    move-result v1

    .line 2900
    if-eqz v1, :cond_86

    .line 2901
    .line 2902
    iget-object v1, v4, Lj6/d;->p:Lp4/s;

    .line 2903
    .line 2904
    const/16 v23, 0x8

    .line 2905
    .line 2906
    invoke-static/range {v23 .. v23}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 2907
    .line 2908
    .line 2909
    move-result-object v2

    .line 2910
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 2911
    .line 2912
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 2913
    .line 2914
    .line 2915
    move-result-object v2

    .line 2916
    iget-wide v5, v4, Lj6/d;->U:J

    .line 2917
    .line 2918
    invoke-virtual {v2, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 2919
    .line 2920
    .line 2921
    move-result-object v2

    .line 2922
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 2923
    .line 2924
    .line 2925
    move-result-object v2

    .line 2926
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2927
    .line 2928
    .line 2929
    array-length v3, v2

    .line 2930
    invoke-virtual {v1, v2, v3}, Lp4/s;->E([BI)V

    .line 2931
    .line 2932
    .line 2933
    :cond_86
    const/4 v1, 0x0

    .line 2934
    const/4 v2, 0x0

    .line 2935
    :goto_34
    iget v3, v4, Lj6/d;->N:I

    .line 2936
    .line 2937
    if-ge v1, v3, :cond_87

    .line 2938
    .line 2939
    iget-object v3, v4, Lj6/d;->O:[I

    .line 2940
    .line 2941
    aget v3, v3, v1

    .line 2942
    .line 2943
    add-int/2addr v2, v3

    .line 2944
    add-int/lit8 v1, v1, 0x1

    .line 2945
    .line 2946
    goto :goto_34

    .line 2947
    :cond_87
    const/4 v1, 0x0

    .line 2948
    :goto_35
    iget v3, v4, Lj6/d;->N:I

    .line 2949
    .line 2950
    if-ge v1, v3, :cond_89

    .line 2951
    .line 2952
    iget-wide v5, v4, Lj6/d;->K:J

    .line 2953
    .line 2954
    iget v3, v0, Lj6/c;->f:I

    .line 2955
    .line 2956
    mul-int v3, v3, v1

    .line 2957
    .line 2958
    const/16 v7, 0x3e8

    .line 2959
    .line 2960
    div-int/2addr v3, v7

    .line 2961
    int-to-long v7, v3

    .line 2962
    add-long v31, v5, v7

    .line 2963
    .line 2964
    iget v3, v4, Lj6/d;->R:I

    .line 2965
    .line 2966
    if-nez v1, :cond_88

    .line 2967
    .line 2968
    iget-boolean v5, v4, Lj6/d;->T:Z

    .line 2969
    .line 2970
    if-nez v5, :cond_88

    .line 2971
    .line 2972
    or-int/lit8 v3, v3, 0x1

    .line 2973
    .line 2974
    :cond_88
    move/from16 v33, v3

    .line 2975
    .line 2976
    iget-object v3, v4, Lj6/d;->O:[I

    .line 2977
    .line 2978
    aget v34, v3, v1

    .line 2979
    .line 2980
    sub-int v35, v2, v34

    .line 2981
    .line 2982
    move-object/from16 v30, v0

    .line 2983
    .line 2984
    move-object/from16 v29, v4

    .line 2985
    .line 2986
    invoke-virtual/range {v29 .. v35}, Lj6/d;->e(Lj6/c;JIII)V

    .line 2987
    .line 2988
    .line 2989
    add-int/lit8 v1, v1, 0x1

    .line 2990
    .line 2991
    move/from16 v2, v35

    .line 2992
    .line 2993
    goto :goto_35

    .line 2994
    :cond_89
    const/4 v0, 0x0

    .line 2995
    iput v0, v4, Lj6/d;->J:I

    .line 2996
    .line 2997
    :goto_36
    move-object/from16 v1, p1

    .line 2998
    .line 2999
    :goto_37
    const/4 v4, 0x0

    .line 3000
    :goto_38
    const/4 v5, 0x1

    .line 3001
    goto/16 :goto_4f

    .line 3002
    .line 3003
    :cond_8a
    const/4 v0, 0x0

    .line 3004
    iget v1, v7, Lj6/b;->e:I

    .line 3005
    .line 3006
    const v2, 0x1f43b675

    .line 3007
    .line 3008
    .line 3009
    if-nez v1, :cond_91

    .line 3010
    .line 3011
    move-object/from16 v1, p1

    .line 3012
    .line 3013
    const/4 v4, 0x4

    .line 3014
    const/4 v5, 0x1

    .line 3015
    invoke-virtual {v8, v1, v5, v0, v4}, Lj6/e;->b(Lr5/o;ZZI)J

    .line 3016
    .line 3017
    .line 3018
    move-result-wide v29

    .line 3019
    const-wide/16 v5, -0x2

    .line 3020
    .line 3021
    cmp-long v12, v29, v5

    .line 3022
    .line 3023
    if-nez v12, :cond_8f

    .line 3024
    .line 3025
    iget-object v5, v7, Lj6/b;->a:[B

    .line 3026
    .line 3027
    invoke-interface {v1}, Lr5/o;->q()V

    .line 3028
    .line 3029
    .line 3030
    :goto_39
    invoke-interface {v1, v5, v0, v4}, Lr5/o;->z([BII)V

    .line 3031
    .line 3032
    .line 3033
    aget-byte v4, v5, v0

    .line 3034
    .line 3035
    const/4 v0, 0x0

    .line 3036
    :goto_3a
    const/16 v6, 0x8

    .line 3037
    .line 3038
    if-ge v0, v6, :cond_8c

    .line 3039
    .line 3040
    sget-object v6, Lj6/e;->d:[J

    .line 3041
    .line 3042
    aget-wide v29, v6, v0

    .line 3043
    .line 3044
    int-to-long v13, v4

    .line 3045
    and-long v13, v29, v13

    .line 3046
    .line 3047
    cmp-long v29, v13, v17

    .line 3048
    .line 3049
    if-eqz v29, :cond_8b

    .line 3050
    .line 3051
    add-int/lit8 v0, v0, 0x1

    .line 3052
    .line 3053
    :goto_3b
    const/4 v4, -0x1

    .line 3054
    goto :goto_3c

    .line 3055
    :cond_8b
    add-int/lit8 v0, v0, 0x1

    .line 3056
    .line 3057
    const/16 v13, 0xae

    .line 3058
    .line 3059
    const/16 v14, 0xa0

    .line 3060
    .line 3061
    goto :goto_3a

    .line 3062
    :cond_8c
    const/4 v0, -0x1

    .line 3063
    goto :goto_3b

    .line 3064
    :goto_3c
    if-eq v0, v4, :cond_8d

    .line 3065
    .line 3066
    const/4 v4, 0x4

    .line 3067
    if-gt v0, v4, :cond_8d

    .line 3068
    .line 3069
    const/4 v4, 0x0

    .line 3070
    invoke-static {v5, v0, v4}, Lj6/e;->a([BIZ)J

    .line 3071
    .line 3072
    .line 3073
    move-result-wide v13

    .line 3074
    long-to-int v4, v13

    .line 3075
    iget-object v13, v7, Lj6/b;->d:Li7/p2;

    .line 3076
    .line 3077
    iget-object v13, v13, Li7/p2;->a:Ljava/lang/Object;

    .line 3078
    .line 3079
    if-eq v4, v15, :cond_8e

    .line 3080
    .line 3081
    if-eq v4, v2, :cond_8e

    .line 3082
    .line 3083
    if-eq v4, v3, :cond_8e

    .line 3084
    .line 3085
    if-ne v4, v11, :cond_8d

    .line 3086
    .line 3087
    goto :goto_3d

    .line 3088
    :cond_8d
    const/4 v14, 0x1

    .line 3089
    goto :goto_3f

    .line 3090
    :cond_8e
    :goto_3d
    invoke-interface {v1, v0}, Lr5/o;->r(I)V

    .line 3091
    .line 3092
    .line 3093
    int-to-long v4, v4

    .line 3094
    :goto_3e
    const/4 v14, 0x1

    .line 3095
    goto :goto_40

    .line 3096
    :goto_3f
    invoke-interface {v1, v14}, Lr5/o;->r(I)V

    .line 3097
    .line 3098
    .line 3099
    const/4 v0, 0x0

    .line 3100
    const/4 v4, 0x4

    .line 3101
    const/16 v13, 0xae

    .line 3102
    .line 3103
    const/16 v14, 0xa0

    .line 3104
    .line 3105
    goto :goto_39

    .line 3106
    :cond_8f
    move-wide/from16 v4, v29

    .line 3107
    .line 3108
    goto :goto_3e

    .line 3109
    :goto_40
    cmp-long v0, v4, v20

    .line 3110
    .line 3111
    if-nez v0, :cond_90

    .line 3112
    .line 3113
    const/4 v4, 0x0

    .line 3114
    const/4 v5, 0x0

    .line 3115
    goto/16 :goto_4f

    .line 3116
    .line 3117
    :cond_90
    long-to-int v0, v4

    .line 3118
    iput v0, v7, Lj6/b;->f:I

    .line 3119
    .line 3120
    iput v14, v7, Lj6/b;->e:I

    .line 3121
    .line 3122
    goto :goto_41

    .line 3123
    :cond_91
    move-object/from16 v1, p1

    .line 3124
    .line 3125
    const/4 v14, 0x1

    .line 3126
    :goto_41
    iget v0, v7, Lj6/b;->e:I

    .line 3127
    .line 3128
    if-ne v0, v14, :cond_92

    .line 3129
    .line 3130
    const/4 v4, 0x0

    .line 3131
    const/16 v11, 0x8

    .line 3132
    .line 3133
    invoke-virtual {v8, v1, v4, v14, v11}, Lj6/e;->b(Lr5/o;ZZI)J

    .line 3134
    .line 3135
    .line 3136
    move-result-wide v12

    .line 3137
    iput-wide v12, v7, Lj6/b;->g:J

    .line 3138
    .line 3139
    const/4 v14, 0x2

    .line 3140
    iput v14, v7, Lj6/b;->e:I

    .line 3141
    .line 3142
    :cond_92
    iget-object v4, v7, Lj6/b;->d:Li7/p2;

    .line 3143
    .line 3144
    iget v5, v7, Lj6/b;->f:I

    .line 3145
    .line 3146
    iget-object v11, v4, Li7/p2;->a:Ljava/lang/Object;

    .line 3147
    .line 3148
    sparse-switch v5, :sswitch_data_2

    .line 3149
    .line 3150
    .line 3151
    const/4 v11, 0x0

    .line 3152
    goto :goto_42

    .line 3153
    :sswitch_42
    const/4 v11, 0x5

    .line 3154
    goto :goto_42

    .line 3155
    :sswitch_43
    const/4 v11, 0x4

    .line 3156
    goto :goto_42

    .line 3157
    :sswitch_44
    const/4 v11, 0x1

    .line 3158
    goto :goto_42

    .line 3159
    :sswitch_45
    const/4 v11, 0x3

    .line 3160
    goto :goto_42

    .line 3161
    :sswitch_46
    const/4 v11, 0x2

    .line 3162
    :goto_42
    if-eqz v11, :cond_b7

    .line 3163
    .line 3164
    const/4 v14, 0x1

    .line 3165
    if-eq v11, v14, :cond_a6

    .line 3166
    .line 3167
    const-wide/16 v2, 0x8

    .line 3168
    .line 3169
    const/4 v14, 0x2

    .line 3170
    if-eq v11, v14, :cond_a4

    .line 3171
    .line 3172
    const/4 v15, 0x3

    .line 3173
    if-eq v11, v15, :cond_9a

    .line 3174
    .line 3175
    const/4 v15, 0x4

    .line 3176
    if-eq v11, v15, :cond_99

    .line 3177
    .line 3178
    const/4 v0, 0x5

    .line 3179
    if-ne v11, v0, :cond_98

    .line 3180
    .line 3181
    iget-wide v8, v7, Lj6/b;->g:J

    .line 3182
    .line 3183
    const-wide/16 v10, 0x4

    .line 3184
    .line 3185
    cmp-long v0, v8, v10

    .line 3186
    .line 3187
    if-eqz v0, :cond_94

    .line 3188
    .line 3189
    cmp-long v0, v8, v2

    .line 3190
    .line 3191
    if-nez v0, :cond_93

    .line 3192
    .line 3193
    goto :goto_43

    .line 3194
    :cond_93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3195
    .line 3196
    const-string v1, "Invalid float size: "

    .line 3197
    .line 3198
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3199
    .line 3200
    .line 3201
    iget-wide v1, v7, Lj6/b;->g:J

    .line 3202
    .line 3203
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3204
    .line 3205
    .line 3206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3207
    .line 3208
    .line 3209
    move-result-object v0

    .line 3210
    const/4 v1, 0x0

    .line 3211
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 3212
    .line 3213
    .line 3214
    move-result-object v0

    .line 3215
    throw v0

    .line 3216
    :cond_94
    :goto_43
    long-to-int v0, v8

    .line 3217
    invoke-virtual {v7, v1, v0}, Lj6/b;->a(Lr5/o;I)J

    .line 3218
    .line 3219
    .line 3220
    move-result-wide v2

    .line 3221
    const/4 v15, 0x4

    .line 3222
    if-ne v0, v15, :cond_95

    .line 3223
    .line 3224
    long-to-int v0, v2

    .line 3225
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 3226
    .line 3227
    .line 3228
    move-result v0

    .line 3229
    float-to-double v2, v0

    .line 3230
    goto :goto_44

    .line 3231
    :cond_95
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 3232
    .line 3233
    .line 3234
    move-result-wide v2

    .line 3235
    :goto_44
    iget-object v0, v4, Li7/p2;->a:Ljava/lang/Object;

    .line 3236
    .line 3237
    check-cast v0, Lj6/d;

    .line 3238
    .line 3239
    const/16 v4, 0xb5

    .line 3240
    .line 3241
    if-eq v5, v4, :cond_97

    .line 3242
    .line 3243
    const/16 v4, 0x4489

    .line 3244
    .line 3245
    if-eq v5, v4, :cond_96

    .line 3246
    .line 3247
    packed-switch v5, :pswitch_data_2

    .line 3248
    .line 3249
    .line 3250
    packed-switch v5, :pswitch_data_3

    .line 3251
    .line 3252
    .line 3253
    :goto_45
    const/4 v4, 0x0

    .line 3254
    goto/16 :goto_46

    .line 3255
    .line 3256
    :pswitch_1f
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3257
    .line 3258
    .line 3259
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3260
    .line 3261
    double-to-float v2, v2

    .line 3262
    iput v2, v0, Lj6/c;->w:F

    .line 3263
    .line 3264
    goto :goto_45

    .line 3265
    :pswitch_20
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3266
    .line 3267
    .line 3268
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3269
    .line 3270
    double-to-float v2, v2

    .line 3271
    iput v2, v0, Lj6/c;->v:F

    .line 3272
    .line 3273
    goto :goto_45

    .line 3274
    :pswitch_21
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3275
    .line 3276
    .line 3277
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3278
    .line 3279
    double-to-float v2, v2

    .line 3280
    iput v2, v0, Lj6/c;->u:F

    .line 3281
    .line 3282
    goto :goto_45

    .line 3283
    :pswitch_22
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3284
    .line 3285
    .line 3286
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3287
    .line 3288
    double-to-float v2, v2

    .line 3289
    iput v2, v0, Lj6/c;->O:F

    .line 3290
    .line 3291
    goto :goto_45

    .line 3292
    :pswitch_23
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3293
    .line 3294
    .line 3295
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3296
    .line 3297
    double-to-float v2, v2

    .line 3298
    iput v2, v0, Lj6/c;->N:F

    .line 3299
    .line 3300
    goto :goto_45

    .line 3301
    :pswitch_24
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3302
    .line 3303
    .line 3304
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3305
    .line 3306
    double-to-float v2, v2

    .line 3307
    iput v2, v0, Lj6/c;->M:F

    .line 3308
    .line 3309
    goto :goto_45

    .line 3310
    :pswitch_25
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3311
    .line 3312
    .line 3313
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3314
    .line 3315
    double-to-float v2, v2

    .line 3316
    iput v2, v0, Lj6/c;->L:F

    .line 3317
    .line 3318
    goto :goto_45

    .line 3319
    :pswitch_26
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3320
    .line 3321
    .line 3322
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3323
    .line 3324
    double-to-float v2, v2

    .line 3325
    iput v2, v0, Lj6/c;->K:F

    .line 3326
    .line 3327
    goto :goto_45

    .line 3328
    :pswitch_27
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3329
    .line 3330
    .line 3331
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3332
    .line 3333
    double-to-float v2, v2

    .line 3334
    iput v2, v0, Lj6/c;->J:F

    .line 3335
    .line 3336
    goto :goto_45

    .line 3337
    :pswitch_28
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3338
    .line 3339
    .line 3340
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3341
    .line 3342
    double-to-float v2, v2

    .line 3343
    iput v2, v0, Lj6/c;->I:F

    .line 3344
    .line 3345
    goto :goto_45

    .line 3346
    :pswitch_29
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3347
    .line 3348
    .line 3349
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3350
    .line 3351
    double-to-float v2, v2

    .line 3352
    iput v2, v0, Lj6/c;->H:F

    .line 3353
    .line 3354
    goto :goto_45

    .line 3355
    :pswitch_2a
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3356
    .line 3357
    .line 3358
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3359
    .line 3360
    double-to-float v2, v2

    .line 3361
    iput v2, v0, Lj6/c;->G:F

    .line 3362
    .line 3363
    goto :goto_45

    .line 3364
    :pswitch_2b
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3365
    .line 3366
    .line 3367
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3368
    .line 3369
    double-to-float v2, v2

    .line 3370
    iput v2, v0, Lj6/c;->F:F

    .line 3371
    .line 3372
    goto :goto_45

    .line 3373
    :cond_96
    double-to-long v2, v2

    .line 3374
    iput-wide v2, v0, Lj6/d;->u:J

    .line 3375
    .line 3376
    goto :goto_45

    .line 3377
    :cond_97
    invoke-virtual {v0, v5}, Lj6/d;->d(I)V

    .line 3378
    .line 3379
    .line 3380
    iget-object v0, v0, Lj6/d;->x:Lj6/c;

    .line 3381
    .line 3382
    double-to-int v2, v2

    .line 3383
    iput v2, v0, Lj6/c;->S:I

    .line 3384
    .line 3385
    goto/16 :goto_45

    .line 3386
    .line 3387
    :goto_46
    iput v4, v7, Lj6/b;->e:I

    .line 3388
    .line 3389
    goto/16 :goto_38

    .line 3390
    .line 3391
    :cond_98
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3392
    .line 3393
    const-string v1, "Invalid element type "

    .line 3394
    .line 3395
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3396
    .line 3397
    .line 3398
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3399
    .line 3400
    .line 3401
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3402
    .line 3403
    .line 3404
    move-result-object v0

    .line 3405
    const/4 v1, 0x0

    .line 3406
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 3407
    .line 3408
    .line 3409
    move-result-object v0

    .line 3410
    throw v0

    .line 3411
    :cond_99
    iget-wide v2, v7, Lj6/b;->g:J

    .line 3412
    .line 3413
    long-to-int v0, v2

    .line 3414
    invoke-virtual {v4, v5, v0, v1}, Li7/p2;->m(IILr5/o;)V

    .line 3415
    .line 3416
    .line 3417
    const/4 v9, 0x0

    .line 3418
    iput v9, v7, Lj6/b;->e:I

    .line 3419
    .line 3420
    goto/16 :goto_37

    .line 3421
    .line 3422
    :cond_9a
    const/4 v9, 0x0

    .line 3423
    iget-wide v2, v7, Lj6/b;->g:J

    .line 3424
    .line 3425
    const-wide/32 v10, 0x7fffffff

    .line 3426
    .line 3427
    .line 3428
    cmp-long v0, v2, v10

    .line 3429
    .line 3430
    if-gtz v0, :cond_a3

    .line 3431
    .line 3432
    long-to-int v0, v2

    .line 3433
    if-nez v0, :cond_9b

    .line 3434
    .line 3435
    const-string v0, ""

    .line 3436
    .line 3437
    goto :goto_48

    .line 3438
    :cond_9b
    new-array v2, v0, [B

    .line 3439
    .line 3440
    invoke-interface {v1, v2, v9, v0}, Lr5/o;->readFully([BII)V

    .line 3441
    .line 3442
    .line 3443
    :goto_47
    if-lez v0, :cond_9c

    .line 3444
    .line 3445
    add-int/lit8 v3, v0, -0x1

    .line 3446
    .line 3447
    aget-byte v3, v2, v3

    .line 3448
    .line 3449
    if-nez v3, :cond_9c

    .line 3450
    .line 3451
    add-int/lit8 v0, v0, -0x1

    .line 3452
    .line 3453
    goto :goto_47

    .line 3454
    :cond_9c
    new-instance v3, Ljava/lang/String;

    .line 3455
    .line 3456
    const/4 v9, 0x0

    .line 3457
    invoke-direct {v3, v2, v9, v0}, Ljava/lang/String;-><init>([BII)V

    .line 3458
    .line 3459
    .line 3460
    move-object v0, v3

    .line 3461
    :goto_48
    iget-object v2, v4, Li7/p2;->a:Ljava/lang/Object;

    .line 3462
    .line 3463
    check-cast v2, Lj6/d;

    .line 3464
    .line 3465
    const/16 v3, 0x86

    .line 3466
    .line 3467
    if-eq v5, v3, :cond_a2

    .line 3468
    .line 3469
    const/16 v3, 0x4282

    .line 3470
    .line 3471
    if-eq v5, v3, :cond_9f

    .line 3472
    .line 3473
    const/16 v3, 0x536e

    .line 3474
    .line 3475
    if-eq v5, v3, :cond_9e

    .line 3476
    .line 3477
    const v3, 0x22b59c

    .line 3478
    .line 3479
    .line 3480
    if-eq v5, v3, :cond_9d

    .line 3481
    .line 3482
    :goto_49
    const/4 v4, 0x0

    .line 3483
    goto :goto_4b

    .line 3484
    :cond_9d
    invoke-virtual {v2, v5}, Lj6/d;->d(I)V

    .line 3485
    .line 3486
    .line 3487
    iget-object v2, v2, Lj6/d;->x:Lj6/c;

    .line 3488
    .line 3489
    iput-object v0, v2, Lj6/c;->Y:Ljava/lang/String;

    .line 3490
    .line 3491
    goto :goto_49

    .line 3492
    :cond_9e
    invoke-virtual {v2, v5}, Lj6/d;->d(I)V

    .line 3493
    .line 3494
    .line 3495
    iget-object v2, v2, Lj6/d;->x:Lj6/c;

    .line 3496
    .line 3497
    iput-object v0, v2, Lj6/c;->b:Ljava/lang/String;

    .line 3498
    .line 3499
    goto :goto_49

    .line 3500
    :cond_9f
    const-string v3, "webm"

    .line 3501
    .line 3502
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3503
    .line 3504
    .line 3505
    move-result v4

    .line 3506
    if-nez v4, :cond_a1

    .line 3507
    .line 3508
    const-string v4, "matroska"

    .line 3509
    .line 3510
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 3511
    .line 3512
    .line 3513
    move-result v4

    .line 3514
    if-eqz v4, :cond_a0

    .line 3515
    .line 3516
    goto :goto_4a

    .line 3517
    :cond_a0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 3518
    .line 3519
    const-string v2, "DocType "

    .line 3520
    .line 3521
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3522
    .line 3523
    .line 3524
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3525
    .line 3526
    .line 3527
    const-string v0, " not supported"

    .line 3528
    .line 3529
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3530
    .line 3531
    .line 3532
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3533
    .line 3534
    .line 3535
    move-result-object v0

    .line 3536
    const/4 v1, 0x0

    .line 3537
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 3538
    .line 3539
    .line 3540
    move-result-object v0

    .line 3541
    throw v0

    .line 3542
    :cond_a1
    :goto_4a
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 3543
    .line 3544
    .line 3545
    move-result v0

    .line 3546
    iput-boolean v0, v2, Lj6/d;->w:Z

    .line 3547
    .line 3548
    goto :goto_49

    .line 3549
    :cond_a2
    invoke-virtual {v2, v5}, Lj6/d;->d(I)V

    .line 3550
    .line 3551
    .line 3552
    iget-object v2, v2, Lj6/d;->x:Lj6/c;

    .line 3553
    .line 3554
    iput-object v0, v2, Lj6/c;->c:Ljava/lang/String;

    .line 3555
    .line 3556
    goto :goto_49

    .line 3557
    :goto_4b
    iput v4, v7, Lj6/b;->e:I

    .line 3558
    .line 3559
    goto/16 :goto_38

    .line 3560
    .line 3561
    :cond_a3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3562
    .line 3563
    const-string v1, "String element size: "

    .line 3564
    .line 3565
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3566
    .line 3567
    .line 3568
    iget-wide v1, v7, Lj6/b;->g:J

    .line 3569
    .line 3570
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3571
    .line 3572
    .line 3573
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3574
    .line 3575
    .line 3576
    move-result-object v0

    .line 3577
    const/4 v1, 0x0

    .line 3578
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 3579
    .line 3580
    .line 3581
    move-result-object v0

    .line 3582
    throw v0

    .line 3583
    :cond_a4
    iget-wide v8, v7, Lj6/b;->g:J

    .line 3584
    .line 3585
    cmp-long v0, v8, v2

    .line 3586
    .line 3587
    if-gtz v0, :cond_a5

    .line 3588
    .line 3589
    long-to-int v0, v8

    .line 3590
    invoke-virtual {v7, v1, v0}, Lj6/b;->a(Lr5/o;I)J

    .line 3591
    .line 3592
    .line 3593
    move-result-wide v2

    .line 3594
    invoke-virtual {v4, v5, v2, v3}, Li7/p2;->z(IJ)V

    .line 3595
    .line 3596
    .line 3597
    const/4 v4, 0x0

    .line 3598
    iput v4, v7, Lj6/b;->e:I

    .line 3599
    .line 3600
    goto/16 :goto_38

    .line 3601
    .line 3602
    :cond_a5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3603
    .line 3604
    const-string v1, "Invalid integer size: "

    .line 3605
    .line 3606
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3607
    .line 3608
    .line 3609
    iget-wide v1, v7, Lj6/b;->g:J

    .line 3610
    .line 3611
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 3612
    .line 3613
    .line 3614
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3615
    .line 3616
    .line 3617
    move-result-object v0

    .line 3618
    const/4 v1, 0x0

    .line 3619
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 3620
    .line 3621
    .line 3622
    move-result-object v0

    .line 3623
    throw v0

    .line 3624
    :cond_a6
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 3625
    .line 3626
    .line 3627
    move-result-wide v4

    .line 3628
    iget-wide v11, v7, Lj6/b;->g:J

    .line 3629
    .line 3630
    add-long/2addr v11, v4

    .line 3631
    new-instance v8, Lj6/a;

    .line 3632
    .line 3633
    iget v13, v7, Lj6/b;->f:I

    .line 3634
    .line 3635
    invoke-direct {v8, v13, v11, v12}, Lj6/a;-><init>(IJ)V

    .line 3636
    .line 3637
    .line 3638
    invoke-virtual {v9, v8}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 3639
    .line 3640
    .line 3641
    iget-object v8, v7, Lj6/b;->d:Li7/p2;

    .line 3642
    .line 3643
    iget v9, v7, Lj6/b;->f:I

    .line 3644
    .line 3645
    iget-wide v11, v7, Lj6/b;->g:J

    .line 3646
    .line 3647
    iget-object v8, v8, Li7/p2;->a:Ljava/lang/Object;

    .line 3648
    .line 3649
    check-cast v8, Lj6/d;

    .line 3650
    .line 3651
    iget-object v13, v8, Lj6/d;->e0:Lr5/q;

    .line 3652
    .line 3653
    invoke-static {v13}, Lp4/c;->j(Ljava/lang/Object;)V

    .line 3654
    .line 3655
    .line 3656
    const/16 v6, 0xa0

    .line 3657
    .line 3658
    if-eq v9, v6, :cond_b3

    .line 3659
    .line 3660
    const/16 v0, 0xae

    .line 3661
    .line 3662
    if-eq v9, v0, :cond_b2

    .line 3663
    .line 3664
    const/16 v0, 0xbb

    .line 3665
    .line 3666
    if-eq v9, v0, :cond_b1

    .line 3667
    .line 3668
    if-eq v9, v10, :cond_b0

    .line 3669
    .line 3670
    const/16 v0, 0x5035

    .line 3671
    .line 3672
    if-eq v9, v0, :cond_af

    .line 3673
    .line 3674
    const/16 v0, 0x55d0

    .line 3675
    .line 3676
    if-eq v9, v0, :cond_ae

    .line 3677
    .line 3678
    const v0, 0x18538067

    .line 3679
    .line 3680
    .line 3681
    if-eq v9, v0, :cond_ab

    .line 3682
    .line 3683
    if-eq v9, v3, :cond_aa

    .line 3684
    .line 3685
    if-eq v9, v2, :cond_a8

    .line 3686
    .line 3687
    :cond_a7
    const/4 v14, 0x1

    .line 3688
    goto :goto_4c

    .line 3689
    :cond_a8
    iget-boolean v0, v8, Lj6/d;->y:Z

    .line 3690
    .line 3691
    if-nez v0, :cond_a7

    .line 3692
    .line 3693
    iget-boolean v0, v8, Lj6/d;->d:Z

    .line 3694
    .line 3695
    if-eqz v0, :cond_a9

    .line 3696
    .line 3697
    iget-wide v2, v8, Lj6/d;->C:J

    .line 3698
    .line 3699
    cmp-long v0, v2, v20

    .line 3700
    .line 3701
    if-eqz v0, :cond_a9

    .line 3702
    .line 3703
    const/4 v14, 0x1

    .line 3704
    iput-boolean v14, v8, Lj6/d;->B:Z

    .line 3705
    .line 3706
    :goto_4c
    const/4 v4, 0x0

    .line 3707
    goto/16 :goto_4e

    .line 3708
    .line 3709
    :cond_a9
    const/4 v14, 0x1

    .line 3710
    iget-object v0, v8, Lj6/d;->e0:Lr5/q;

    .line 3711
    .line 3712
    new-instance v2, Lr5/s;

    .line 3713
    .line 3714
    iget-wide v3, v8, Lj6/d;->v:J

    .line 3715
    .line 3716
    invoke-direct {v2, v3, v4}, Lr5/s;-><init>(J)V

    .line 3717
    .line 3718
    .line 3719
    invoke-interface {v0, v2}, Lr5/q;->a(Lr5/b0;)V

    .line 3720
    .line 3721
    .line 3722
    iput-boolean v14, v8, Lj6/d;->y:Z

    .line 3723
    .line 3724
    goto :goto_4c

    .line 3725
    :cond_aa
    const/4 v14, 0x1

    .line 3726
    new-instance v0, Ld2/b;

    .line 3727
    .line 3728
    const/4 v4, 0x0

    .line 3729
    invoke-direct {v0, v4, v14}, Ld2/b;-><init>(BI)V

    .line 3730
    .line 3731
    .line 3732
    iput-object v0, v8, Lj6/d;->F:Ld2/b;

    .line 3733
    .line 3734
    new-instance v0, Ld2/b;

    .line 3735
    .line 3736
    invoke-direct {v0, v4, v14}, Ld2/b;-><init>(BI)V

    .line 3737
    .line 3738
    .line 3739
    iput-object v0, v8, Lj6/d;->G:Ld2/b;

    .line 3740
    .line 3741
    goto :goto_4c

    .line 3742
    :cond_ab
    iget-wide v2, v8, Lj6/d;->s:J

    .line 3743
    .line 3744
    cmp-long v0, v2, v20

    .line 3745
    .line 3746
    if-eqz v0, :cond_ad

    .line 3747
    .line 3748
    cmp-long v0, v2, v4

    .line 3749
    .line 3750
    if-nez v0, :cond_ac

    .line 3751
    .line 3752
    goto :goto_4d

    .line 3753
    :cond_ac
    const-string v0, "Multiple Segment elements not supported"

    .line 3754
    .line 3755
    const/4 v1, 0x0

    .line 3756
    invoke-static {v1, v0}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 3757
    .line 3758
    .line 3759
    move-result-object v0

    .line 3760
    throw v0

    .line 3761
    :cond_ad
    :goto_4d
    iput-wide v4, v8, Lj6/d;->s:J

    .line 3762
    .line 3763
    iput-wide v11, v8, Lj6/d;->r:J

    .line 3764
    .line 3765
    goto :goto_4c

    .line 3766
    :cond_ae
    invoke-virtual {v8, v9}, Lj6/d;->d(I)V

    .line 3767
    .line 3768
    .line 3769
    iget-object v0, v8, Lj6/d;->x:Lj6/c;

    .line 3770
    .line 3771
    const/4 v14, 0x1

    .line 3772
    iput-boolean v14, v0, Lj6/c;->z:Z

    .line 3773
    .line 3774
    goto :goto_4c

    .line 3775
    :cond_af
    const/4 v14, 0x1

    .line 3776
    invoke-virtual {v8, v9}, Lj6/d;->d(I)V

    .line 3777
    .line 3778
    .line 3779
    iget-object v0, v8, Lj6/d;->x:Lj6/c;

    .line 3780
    .line 3781
    iput-boolean v14, v0, Lj6/c;->i:Z

    .line 3782
    .line 3783
    goto :goto_4c

    .line 3784
    :cond_b0
    const/4 v4, -0x1

    .line 3785
    iput v4, v8, Lj6/d;->z:I

    .line 3786
    .line 3787
    move-wide/from16 v2, v20

    .line 3788
    .line 3789
    iput-wide v2, v8, Lj6/d;->A:J

    .line 3790
    .line 3791
    goto :goto_4c

    .line 3792
    :cond_b1
    const/4 v9, 0x0

    .line 3793
    iput-boolean v9, v8, Lj6/d;->H:Z

    .line 3794
    .line 3795
    goto :goto_4c

    .line 3796
    :cond_b2
    const/4 v4, -0x1

    .line 3797
    const/4 v9, 0x0

    .line 3798
    new-instance v0, Lj6/c;

    .line 3799
    .line 3800
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3801
    .line 3802
    .line 3803
    iput v4, v0, Lj6/c;->n:I

    .line 3804
    .line 3805
    iput v4, v0, Lj6/c;->o:I

    .line 3806
    .line 3807
    iput v4, v0, Lj6/c;->p:I

    .line 3808
    .line 3809
    iput v4, v0, Lj6/c;->q:I

    .line 3810
    .line 3811
    iput v4, v0, Lj6/c;->r:I

    .line 3812
    .line 3813
    iput v9, v0, Lj6/c;->s:I

    .line 3814
    .line 3815
    iput v4, v0, Lj6/c;->t:I

    .line 3816
    .line 3817
    const/4 v10, 0x0

    .line 3818
    iput v10, v0, Lj6/c;->u:F

    .line 3819
    .line 3820
    iput v10, v0, Lj6/c;->v:F

    .line 3821
    .line 3822
    iput v10, v0, Lj6/c;->w:F

    .line 3823
    .line 3824
    const/4 v11, 0x0

    .line 3825
    iput-object v11, v0, Lj6/c;->x:[B

    .line 3826
    .line 3827
    iput v4, v0, Lj6/c;->y:I

    .line 3828
    .line 3829
    iput-boolean v9, v0, Lj6/c;->z:Z

    .line 3830
    .line 3831
    iput v4, v0, Lj6/c;->A:I

    .line 3832
    .line 3833
    iput v4, v0, Lj6/c;->B:I

    .line 3834
    .line 3835
    iput v4, v0, Lj6/c;->C:I

    .line 3836
    .line 3837
    const/16 v2, 0x3e8

    .line 3838
    .line 3839
    iput v2, v0, Lj6/c;->D:I

    .line 3840
    .line 3841
    const/16 v2, 0xc8

    .line 3842
    .line 3843
    iput v2, v0, Lj6/c;->E:I

    .line 3844
    .line 3845
    const/high16 v2, -0x40800000    # -1.0f

    .line 3846
    .line 3847
    iput v2, v0, Lj6/c;->F:F

    .line 3848
    .line 3849
    iput v2, v0, Lj6/c;->G:F

    .line 3850
    .line 3851
    iput v2, v0, Lj6/c;->H:F

    .line 3852
    .line 3853
    iput v2, v0, Lj6/c;->I:F

    .line 3854
    .line 3855
    iput v2, v0, Lj6/c;->J:F

    .line 3856
    .line 3857
    iput v2, v0, Lj6/c;->K:F

    .line 3858
    .line 3859
    iput v2, v0, Lj6/c;->L:F

    .line 3860
    .line 3861
    iput v2, v0, Lj6/c;->M:F

    .line 3862
    .line 3863
    iput v2, v0, Lj6/c;->N:F

    .line 3864
    .line 3865
    iput v2, v0, Lj6/c;->O:F

    .line 3866
    .line 3867
    const/4 v14, 0x1

    .line 3868
    iput v14, v0, Lj6/c;->Q:I

    .line 3869
    .line 3870
    const/4 v4, -0x1

    .line 3871
    iput v4, v0, Lj6/c;->R:I

    .line 3872
    .line 3873
    const/16 v2, 0x1f40

    .line 3874
    .line 3875
    iput v2, v0, Lj6/c;->S:I

    .line 3876
    .line 3877
    move-wide/from16 v2, v17

    .line 3878
    .line 3879
    iput-wide v2, v0, Lj6/c;->T:J

    .line 3880
    .line 3881
    iput-wide v2, v0, Lj6/c;->U:J

    .line 3882
    .line 3883
    iput-boolean v14, v0, Lj6/c;->X:Z

    .line 3884
    .line 3885
    const-string v2, "eng"

    .line 3886
    .line 3887
    iput-object v2, v0, Lj6/c;->Y:Ljava/lang/String;

    .line 3888
    .line 3889
    iput-object v0, v8, Lj6/d;->x:Lj6/c;

    .line 3890
    .line 3891
    iget-boolean v2, v8, Lj6/d;->w:Z

    .line 3892
    .line 3893
    iput-boolean v2, v0, Lj6/c;->a:Z

    .line 3894
    .line 3895
    goto/16 :goto_4c

    .line 3896
    .line 3897
    :cond_b3
    move-wide/from16 v2, v17

    .line 3898
    .line 3899
    const/4 v4, 0x0

    .line 3900
    iput-boolean v4, v8, Lj6/d;->T:Z

    .line 3901
    .line 3902
    iput-wide v2, v8, Lj6/d;->U:J

    .line 3903
    .line 3904
    :goto_4e
    iput v4, v7, Lj6/b;->e:I

    .line 3905
    .line 3906
    goto/16 :goto_38

    .line 3907
    .line 3908
    :goto_4f
    if-eqz v5, :cond_b5

    .line 3909
    .line 3910
    invoke-interface {v1}, Lr5/o;->getPosition()J

    .line 3911
    .line 3912
    .line 3913
    move-result-wide v2

    .line 3914
    move-object/from16 v0, p0

    .line 3915
    .line 3916
    iget-boolean v6, v0, Lj6/d;->B:Z

    .line 3917
    .line 3918
    if-eqz v6, :cond_b4

    .line 3919
    .line 3920
    iput-wide v2, v0, Lj6/d;->D:J

    .line 3921
    .line 3922
    iget-wide v1, v0, Lj6/d;->C:J

    .line 3923
    .line 3924
    move-object/from16 v3, p2

    .line 3925
    .line 3926
    iput-wide v1, v3, Lb0/a;->a:J

    .line 3927
    .line 3928
    iput-boolean v4, v0, Lj6/d;->B:Z

    .line 3929
    .line 3930
    const/16 v28, 0x1

    .line 3931
    .line 3932
    return v28

    .line 3933
    :cond_b4
    move-object/from16 v3, p2

    .line 3934
    .line 3935
    const/16 v28, 0x1

    .line 3936
    .line 3937
    iget-boolean v2, v0, Lj6/d;->y:Z

    .line 3938
    .line 3939
    if-eqz v2, :cond_b6

    .line 3940
    .line 3941
    iget-wide v6, v0, Lj6/d;->D:J

    .line 3942
    .line 3943
    const-wide/16 v8, -0x1

    .line 3944
    .line 3945
    cmp-long v2, v6, v8

    .line 3946
    .line 3947
    if-eqz v2, :cond_b6

    .line 3948
    .line 3949
    iput-wide v6, v3, Lb0/a;->a:J

    .line 3950
    .line 3951
    iput-wide v8, v0, Lj6/d;->D:J

    .line 3952
    .line 3953
    return v28

    .line 3954
    :cond_b5
    const/16 v28, 0x1

    .line 3955
    .line 3956
    move-object/from16 v0, p0

    .line 3957
    .line 3958
    move-object/from16 v3, p2

    .line 3959
    .line 3960
    :cond_b6
    const/4 v3, 0x0

    .line 3961
    goto/16 :goto_0

    .line 3962
    .line 3963
    :cond_b7
    move-object/from16 v0, p0

    .line 3964
    .line 3965
    move-object/from16 v3, p2

    .line 3966
    .line 3967
    const/16 v28, 0x1

    .line 3968
    .line 3969
    iget-wide v4, v7, Lj6/b;->g:J

    .line 3970
    .line 3971
    long-to-int v2, v4

    .line 3972
    invoke-interface {v1, v2}, Lr5/o;->r(I)V

    .line 3973
    .line 3974
    .line 3975
    const/4 v4, 0x0

    .line 3976
    iput v4, v7, Lj6/b;->e:I

    .line 3977
    .line 3978
    const/4 v3, 0x0

    .line 3979
    const/4 v6, -0x1

    .line 3980
    goto/16 :goto_1

    .line 3981
    .line 3982
    :cond_b8
    if-nez v5, :cond_bb

    .line 3983
    .line 3984
    const/4 v3, 0x0

    .line 3985
    :goto_50
    iget-object v1, v0, Lj6/d;->c:Landroid/util/SparseArray;

    .line 3986
    .line 3987
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 3988
    .line 3989
    .line 3990
    move-result v2

    .line 3991
    if-ge v3, v2, :cond_ba

    .line 3992
    .line 3993
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 3994
    .line 3995
    .line 3996
    move-result-object v1

    .line 3997
    check-cast v1, Lj6/c;

    .line 3998
    .line 3999
    iget-object v2, v1, Lj6/c;->Z:Lr5/h0;

    .line 4000
    .line 4001
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4002
    .line 4003
    .line 4004
    iget-object v2, v1, Lj6/c;->V:Lr5/i0;

    .line 4005
    .line 4006
    if-eqz v2, :cond_b9

    .line 4007
    .line 4008
    iget-object v4, v1, Lj6/c;->Z:Lr5/h0;

    .line 4009
    .line 4010
    iget-object v1, v1, Lj6/c;->k:Lr5/g0;

    .line 4011
    .line 4012
    invoke-virtual {v2, v4, v1}, Lr5/i0;->a(Lr5/h0;Lr5/g0;)V

    .line 4013
    .line 4014
    .line 4015
    :cond_b9
    add-int/lit8 v3, v3, 0x1

    .line 4016
    .line 4017
    goto :goto_50

    .line 4018
    :cond_ba
    const/16 v27, -0x1

    .line 4019
    .line 4020
    return v27

    .line 4021
    :cond_bb
    const/16 v24, 0x0

    .line 4022
    .line 4023
    return v24

    .line 4024
    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_20
        -0x7ce7f3b0 -> :sswitch_1f
        -0x76567dc0 -> :sswitch_1e
        -0x6a615338 -> :sswitch_1d
        -0x672350af -> :sswitch_1c
        -0x585f4fce -> :sswitch_1b
        -0x585f4fcd -> :sswitch_1a
        -0x51dc40b2 -> :sswitch_19
        -0x37a9c464 -> :sswitch_18
        -0x2016c535 -> :sswitch_17
        -0x2016c4e5 -> :sswitch_16
        -0x19552dbd -> :sswitch_15
        -0x1538b2ba -> :sswitch_14
        0x3c02325 -> :sswitch_13
        0x3c02353 -> :sswitch_12
        0x3c030c5 -> :sswitch_11
        0x4e81333 -> :sswitch_10
        0x4e86155 -> :sswitch_f
        0x4e86156 -> :sswitch_e
        0x5e8da3e -> :sswitch_d
        0x1a8350d6 -> :sswitch_c
        0x2056f406 -> :sswitch_b
        0x25e26ee2 -> :sswitch_a
        0x2b45174d -> :sswitch_9
        0x2b453ce4 -> :sswitch_8
        0x2c0618eb -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x7ce7f5de -> :sswitch_41
        -0x7ce7f3b0 -> :sswitch_40
        -0x76567dc0 -> :sswitch_3f
        -0x6a615338 -> :sswitch_3e
        -0x672350af -> :sswitch_3d
        -0x585f4fce -> :sswitch_3c
        -0x585f4fcd -> :sswitch_3b
        -0x51dc40b2 -> :sswitch_3a
        -0x37a9c464 -> :sswitch_39
        -0x2016c535 -> :sswitch_38
        -0x2016c4e5 -> :sswitch_37
        -0x19552dbd -> :sswitch_36
        -0x1538b2ba -> :sswitch_35
        0x3c02325 -> :sswitch_34
        0x3c02353 -> :sswitch_33
        0x3c030c5 -> :sswitch_32
        0x4e81333 -> :sswitch_31
        0x4e86155 -> :sswitch_30
        0x4e86156 -> :sswitch_2f
        0x5e8da3e -> :sswitch_2e
        0x1a8350d6 -> :sswitch_2d
        0x2056f406 -> :sswitch_2c
        0x25e26ee2 -> :sswitch_2b
        0x2b45174d -> :sswitch_2a
        0x2b453ce4 -> :sswitch_29
        0x2c0618eb -> :sswitch_28
        0x32fdf009 -> :sswitch_27
        0x3e4ca2d8 -> :sswitch_26
        0x54c61e47 -> :sswitch_25
        0x6bd6c624 -> :sswitch_24
        0x7446132a -> :sswitch_23
        0x7446b0a6 -> :sswitch_22
        0x744ad97d -> :sswitch_21
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_1e
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x83 -> :sswitch_46
        0x86 -> :sswitch_45
        0x88 -> :sswitch_46
        0x9b -> :sswitch_46
        0x9f -> :sswitch_46
        0xa0 -> :sswitch_44
        0xa1 -> :sswitch_43
        0xa3 -> :sswitch_43
        0xa5 -> :sswitch_43
        0xa6 -> :sswitch_44
        0xae -> :sswitch_44
        0xb0 -> :sswitch_46
        0xb3 -> :sswitch_46
        0xb5 -> :sswitch_42
        0xb7 -> :sswitch_44
        0xba -> :sswitch_46
        0xbb -> :sswitch_44
        0xd7 -> :sswitch_46
        0xe0 -> :sswitch_44
        0xe1 -> :sswitch_44
        0xe7 -> :sswitch_46
        0xee -> :sswitch_46
        0xf1 -> :sswitch_46
        0xfb -> :sswitch_46
        0x41e4 -> :sswitch_44
        0x41e7 -> :sswitch_46
        0x41ed -> :sswitch_43
        0x4254 -> :sswitch_46
        0x4255 -> :sswitch_43
        0x4282 -> :sswitch_45
        0x4285 -> :sswitch_46
        0x42f7 -> :sswitch_46
        0x4489 -> :sswitch_42
        0x47e1 -> :sswitch_46
        0x47e2 -> :sswitch_43
        0x47e7 -> :sswitch_44
        0x47e8 -> :sswitch_46
        0x4dbb -> :sswitch_44
        0x5031 -> :sswitch_46
        0x5032 -> :sswitch_46
        0x5034 -> :sswitch_44
        0x5035 -> :sswitch_44
        0x536e -> :sswitch_45
        0x53ab -> :sswitch_43
        0x53ac -> :sswitch_46
        0x53b8 -> :sswitch_46
        0x54b0 -> :sswitch_46
        0x54b2 -> :sswitch_46
        0x54ba -> :sswitch_46
        0x55aa -> :sswitch_46
        0x55b0 -> :sswitch_44
        0x55b2 -> :sswitch_46
        0x55b9 -> :sswitch_46
        0x55ba -> :sswitch_46
        0x55bb -> :sswitch_46
        0x55bc -> :sswitch_46
        0x55bd -> :sswitch_46
        0x55d0 -> :sswitch_44
        0x55d1 -> :sswitch_42
        0x55d2 -> :sswitch_42
        0x55d3 -> :sswitch_42
        0x55d4 -> :sswitch_42
        0x55d5 -> :sswitch_42
        0x55d6 -> :sswitch_42
        0x55d7 -> :sswitch_42
        0x55d8 -> :sswitch_42
        0x55d9 -> :sswitch_42
        0x55da -> :sswitch_42
        0x55ee -> :sswitch_46
        0x56aa -> :sswitch_46
        0x56bb -> :sswitch_46
        0x6240 -> :sswitch_44
        0x6264 -> :sswitch_46
        0x63a2 -> :sswitch_43
        0x6d80 -> :sswitch_44
        0x75a1 -> :sswitch_44
        0x75a2 -> :sswitch_46
        0x7670 -> :sswitch_44
        0x7671 -> :sswitch_46
        0x7672 -> :sswitch_43
        0x7673 -> :sswitch_42
        0x7674 -> :sswitch_42
        0x7675 -> :sswitch_42
        0x22b59c -> :sswitch_45
        0x23e383 -> :sswitch_46
        0x2ad7b1 -> :sswitch_46
        0x114d9b74 -> :sswitch_44
        0x1549a966 -> :sswitch_44
        0x1654ae6b -> :sswitch_44
        0x18538067 -> :sswitch_44
        0x1a45dfa3 -> :sswitch_44
        0x1c53bb6b -> :sswitch_44
        0x1f43b675 -> :sswitch_44
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x55d1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7673
        :pswitch_21
        :pswitch_20
        :pswitch_1f
    .end packed-switch
.end method

.method public final h(Lr5/q;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lj6/d;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lb5/d0;

    .line 6
    .line 7
    iget-object v1, p0, Lj6/d;->f:Lo6/j;

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lb5/d0;-><init>(Lr5/q;Lo6/j;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v0

    .line 13
    :cond_0
    iput-object p1, p0, Lj6/d;->e0:Lr5/q;

    .line 14
    .line 15
    return-void
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

.method public final i(JJ)V
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lj6/d;->E:J

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lj6/d;->J:I

    .line 10
    .line 11
    iget-object p2, p0, Lj6/d;->a:Lj6/b;

    .line 12
    .line 13
    iput p1, p2, Lj6/b;->e:I

    .line 14
    .line 15
    iget-object p3, p2, Lj6/b;->b:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p2, p2, Lj6/b;->c:Lj6/e;

    .line 21
    .line 22
    iput p1, p2, Lj6/e;->b:I

    .line 23
    .line 24
    iput p1, p2, Lj6/e;->c:I

    .line 25
    .line 26
    iget-object p2, p0, Lj6/d;->b:Lj6/e;

    .line 27
    .line 28
    iput p1, p2, Lj6/e;->b:I

    .line 29
    .line 30
    iput p1, p2, Lj6/e;->c:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lj6/d;->m()V

    .line 33
    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    :goto_0
    iget-object p3, p0, Lj6/d;->c:Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {p3}, Landroid/util/SparseArray;->size()I

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    if-ge p2, p4, :cond_1

    .line 43
    .line 44
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    check-cast p3, Lj6/c;

    .line 49
    .line 50
    iget-object p3, p3, Lj6/c;->V:Lr5/i0;

    .line 51
    .line 52
    if-eqz p3, :cond_0

    .line 53
    .line 54
    iput-boolean p1, p3, Lr5/i0;->b:Z

    .line 55
    .line 56
    iput p1, p3, Lr5/i0;->c:I

    .line 57
    .line 58
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-void
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lya/i0;->b:Lya/g0;

    .line 2
    .line 3
    sget-object v0, Lya/a1;->e:Lya/a1;

    .line 4
    .line 5
    return-object v0
    .line 6
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
.end method

.method public final l(Lr5/o;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lj6/d;->i:Lp4/s;

    .line 2
    .line 3
    iget v1, v0, Lp4/s;->c:I

    .line 4
    .line 5
    if-lt v1, p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, Lp4/s;->a:[B

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    if-ge v2, p2, :cond_1

    .line 12
    .line 13
    array-length v1, v1

    .line 14
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lp4/s;->b(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v1, v0, Lp4/s;->a:[B

    .line 24
    .line 25
    iget v2, v0, Lp4/s;->c:I

    .line 26
    .line 27
    sub-int v3, p2, v2

    .line 28
    .line 29
    invoke-interface {p1, v1, v2, v3}, Lr5/o;->readFully([BII)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, Lp4/s;->F(I)V

    .line 33
    .line 34
    .line 35
    return-void
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

.method public final m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lj6/d;->V:I

    .line 3
    .line 4
    iput v0, p0, Lj6/d;->W:I

    .line 5
    .line 6
    iput v0, p0, Lj6/d;->X:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lj6/d;->Y:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lj6/d;->Z:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lj6/d;->a0:Z

    .line 13
    .line 14
    iput v0, p0, Lj6/d;->b0:I

    .line 15
    .line 16
    iput-byte v0, p0, Lj6/d;->c0:B

    .line 17
    .line 18
    iput-boolean v0, p0, Lj6/d;->d0:Z

    .line 19
    .line 20
    iget-object v1, p0, Lj6/d;->l:Lp4/s;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lp4/s;->D(I)V

    .line 23
    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final n(J)J
    .locals 7

    .line 1
    iget-wide v2, p0, Lj6/d;->t:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v2, v0

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    sget v0, Lp4/c0;->a:I

    .line 13
    .line 14
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 15
    .line 16
    const-wide/16 v4, 0x3e8

    .line 17
    .line 18
    move-wide v0, p1

    .line 19
    invoke-static/range {v0 .. v6}, Lp4/c0;->V(JJJLjava/math/RoundingMode;)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-static {p2, p1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    throw p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final o(Lr5/o;Lj6/c;IZ)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "S_TEXT/UTF8"

    .line 10
    .line 11
    iget-object v5, v2, Lj6/c;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    sget-object v2, Lj6/d;->f0:[B

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Lj6/d;->p(Lr5/o;[BI)V

    .line 22
    .line 23
    .line 24
    iget v1, v0, Lj6/d;->W:I

    .line 25
    .line 26
    invoke-virtual {v0}, Lj6/d;->m()V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_0
    const-string v4, "S_TEXT/ASS"

    .line 31
    .line 32
    iget-object v5, v2, Lj6/c;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    sget-object v2, Lj6/d;->h0:[B

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Lj6/d;->p(Lr5/o;[BI)V

    .line 43
    .line 44
    .line 45
    iget v1, v0, Lj6/d;->W:I

    .line 46
    .line 47
    invoke-virtual {v0}, Lj6/d;->m()V

    .line 48
    .line 49
    .line 50
    return v1

    .line 51
    :cond_1
    const-string v4, "S_TEXT/WEBVTT"

    .line 52
    .line 53
    iget-object v5, v2, Lj6/c;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    sget-object v2, Lj6/d;->i0:[B

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2, v3}, Lj6/d;->p(Lr5/o;[BI)V

    .line 64
    .line 65
    .line 66
    iget v1, v0, Lj6/d;->W:I

    .line 67
    .line 68
    invoke-virtual {v0}, Lj6/d;->m()V

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :cond_2
    iget-object v4, v2, Lj6/c;->Z:Lr5/h0;

    .line 73
    .line 74
    iget-boolean v5, v0, Lj6/d;->Y:Z

    .line 75
    .line 76
    iget-object v6, v0, Lj6/d;->l:Lp4/s;

    .line 77
    .line 78
    const/4 v7, 0x4

    .line 79
    const/4 v8, 0x2

    .line 80
    const/4 v9, 0x1

    .line 81
    const/4 v10, 0x0

    .line 82
    if-nez v5, :cond_13

    .line 83
    .line 84
    iget-boolean v5, v2, Lj6/c;->i:Z

    .line 85
    .line 86
    iget-object v11, v0, Lj6/d;->i:Lp4/s;

    .line 87
    .line 88
    if-eqz v5, :cond_e

    .line 89
    .line 90
    iget v5, v0, Lj6/d;->R:I

    .line 91
    .line 92
    const v12, -0x40000001    # -1.9999999f

    .line 93
    .line 94
    .line 95
    and-int/2addr v5, v12

    .line 96
    iput v5, v0, Lj6/d;->R:I

    .line 97
    .line 98
    iget-boolean v5, v0, Lj6/d;->Z:Z

    .line 99
    .line 100
    const/16 v12, 0x80

    .line 101
    .line 102
    if-nez v5, :cond_4

    .line 103
    .line 104
    iget-object v5, v11, Lp4/s;->a:[B

    .line 105
    .line 106
    invoke-interface {v1, v5, v10, v9}, Lr5/o;->readFully([BII)V

    .line 107
    .line 108
    .line 109
    iget v5, v0, Lj6/d;->V:I

    .line 110
    .line 111
    add-int/2addr v5, v9

    .line 112
    iput v5, v0, Lj6/d;->V:I

    .line 113
    .line 114
    iget-object v5, v11, Lp4/s;->a:[B

    .line 115
    .line 116
    aget-byte v5, v5, v10

    .line 117
    .line 118
    and-int/lit16 v13, v5, 0x80

    .line 119
    .line 120
    if-eq v13, v12, :cond_3

    .line 121
    .line 122
    iput-byte v5, v0, Lj6/d;->c0:B

    .line 123
    .line 124
    iput-boolean v9, v0, Lj6/d;->Z:Z

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    const-string v1, "Extension bit is set in signal byte"

    .line 128
    .line 129
    const/4 v2, 0x0

    .line 130
    invoke-static {v2, v1}, Lm4/p0;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Lm4/p0;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    throw v1

    .line 135
    :cond_4
    :goto_0
    iget-byte v5, v0, Lj6/d;->c0:B

    .line 136
    .line 137
    and-int/lit8 v13, v5, 0x1

    .line 138
    .line 139
    if-ne v13, v9, :cond_f

    .line 140
    .line 141
    and-int/2addr v5, v8

    .line 142
    if-ne v5, v8, :cond_5

    .line 143
    .line 144
    const/4 v5, 0x1

    .line 145
    goto :goto_1

    .line 146
    :cond_5
    const/4 v5, 0x0

    .line 147
    :goto_1
    iget v13, v0, Lj6/d;->R:I

    .line 148
    .line 149
    const/high16 v14, 0x40000000    # 2.0f

    .line 150
    .line 151
    or-int/2addr v13, v14

    .line 152
    iput v13, v0, Lj6/d;->R:I

    .line 153
    .line 154
    iget-boolean v13, v0, Lj6/d;->d0:Z

    .line 155
    .line 156
    if-nez v13, :cond_7

    .line 157
    .line 158
    iget-object v13, v0, Lj6/d;->n:Lp4/s;

    .line 159
    .line 160
    iget-object v14, v13, Lp4/s;->a:[B

    .line 161
    .line 162
    const/16 v15, 0x8

    .line 163
    .line 164
    invoke-interface {v1, v14, v10, v15}, Lr5/o;->readFully([BII)V

    .line 165
    .line 166
    .line 167
    iget v14, v0, Lj6/d;->V:I

    .line 168
    .line 169
    add-int/2addr v14, v15

    .line 170
    iput v14, v0, Lj6/d;->V:I

    .line 171
    .line 172
    iput-boolean v9, v0, Lj6/d;->d0:Z

    .line 173
    .line 174
    iget-object v14, v11, Lp4/s;->a:[B

    .line 175
    .line 176
    if-eqz v5, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    const/4 v12, 0x0

    .line 180
    :goto_2
    or-int/2addr v12, v15

    .line 181
    int-to-byte v12, v12

    .line 182
    aput-byte v12, v14, v10

    .line 183
    .line 184
    invoke-virtual {v11, v10}, Lp4/s;->G(I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v4, v11, v9, v9}, Lr5/h0;->f(Lp4/s;II)V

    .line 188
    .line 189
    .line 190
    iget v12, v0, Lj6/d;->W:I

    .line 191
    .line 192
    add-int/2addr v12, v9

    .line 193
    iput v12, v0, Lj6/d;->W:I

    .line 194
    .line 195
    invoke-virtual {v13, v10}, Lp4/s;->G(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v4, v13, v15, v9}, Lr5/h0;->f(Lp4/s;II)V

    .line 199
    .line 200
    .line 201
    iget v12, v0, Lj6/d;->W:I

    .line 202
    .line 203
    add-int/2addr v12, v15

    .line 204
    iput v12, v0, Lj6/d;->W:I

    .line 205
    .line 206
    :cond_7
    if-eqz v5, :cond_f

    .line 207
    .line 208
    iget-boolean v5, v0, Lj6/d;->a0:Z

    .line 209
    .line 210
    if-nez v5, :cond_8

    .line 211
    .line 212
    iget-object v5, v11, Lp4/s;->a:[B

    .line 213
    .line 214
    invoke-interface {v1, v5, v10, v9}, Lr5/o;->readFully([BII)V

    .line 215
    .line 216
    .line 217
    iget v5, v0, Lj6/d;->V:I

    .line 218
    .line 219
    add-int/2addr v5, v9

    .line 220
    iput v5, v0, Lj6/d;->V:I

    .line 221
    .line 222
    invoke-virtual {v11, v10}, Lp4/s;->G(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v11}, Lp4/s;->u()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    iput v5, v0, Lj6/d;->b0:I

    .line 230
    .line 231
    iput-boolean v9, v0, Lj6/d;->a0:Z

    .line 232
    .line 233
    :cond_8
    iget v5, v0, Lj6/d;->b0:I

    .line 234
    .line 235
    mul-int/lit8 v5, v5, 0x4

    .line 236
    .line 237
    invoke-virtual {v11, v5}, Lp4/s;->D(I)V

    .line 238
    .line 239
    .line 240
    iget-object v12, v11, Lp4/s;->a:[B

    .line 241
    .line 242
    invoke-interface {v1, v12, v10, v5}, Lr5/o;->readFully([BII)V

    .line 243
    .line 244
    .line 245
    iget v12, v0, Lj6/d;->V:I

    .line 246
    .line 247
    add-int/2addr v12, v5

    .line 248
    iput v12, v0, Lj6/d;->V:I

    .line 249
    .line 250
    iget v5, v0, Lj6/d;->b0:I

    .line 251
    .line 252
    div-int/2addr v5, v8

    .line 253
    add-int/2addr v5, v9

    .line 254
    int-to-short v5, v5

    .line 255
    mul-int/lit8 v12, v5, 0x6

    .line 256
    .line 257
    add-int/2addr v12, v8

    .line 258
    iget-object v13, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 259
    .line 260
    if-eqz v13, :cond_9

    .line 261
    .line 262
    invoke-virtual {v13}, Ljava/nio/Buffer;->capacity()I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    if-ge v13, v12, :cond_a

    .line 267
    .line 268
    :cond_9
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    iput-object v13, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 273
    .line 274
    :cond_a
    iget-object v13, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 275
    .line 276
    invoke-virtual {v13, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 277
    .line 278
    .line 279
    iget-object v13, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 280
    .line 281
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 282
    .line 283
    .line 284
    const/4 v5, 0x0

    .line 285
    const/4 v13, 0x0

    .line 286
    :goto_3
    iget v14, v0, Lj6/d;->b0:I

    .line 287
    .line 288
    if-ge v5, v14, :cond_c

    .line 289
    .line 290
    invoke-virtual {v11}, Lp4/s;->y()I

    .line 291
    .line 292
    .line 293
    move-result v14

    .line 294
    rem-int/lit8 v15, v5, 0x2

    .line 295
    .line 296
    if-nez v15, :cond_b

    .line 297
    .line 298
    iget-object v15, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 299
    .line 300
    sub-int v13, v14, v13

    .line 301
    .line 302
    int-to-short v13, v13

    .line 303
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 304
    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_b
    iget-object v15, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 308
    .line 309
    sub-int v13, v14, v13

    .line 310
    .line 311
    invoke-virtual {v15, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 312
    .line 313
    .line 314
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 315
    .line 316
    move v13, v14

    .line 317
    goto :goto_3

    .line 318
    :cond_c
    iget v5, v0, Lj6/d;->V:I

    .line 319
    .line 320
    sub-int v5, v3, v5

    .line 321
    .line 322
    sub-int/2addr v5, v13

    .line 323
    rem-int/2addr v14, v8

    .line 324
    if-ne v14, v9, :cond_d

    .line 325
    .line 326
    iget-object v13, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 327
    .line 328
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_d
    iget-object v13, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 333
    .line 334
    int-to-short v5, v5

    .line 335
    invoke-virtual {v13, v5}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 336
    .line 337
    .line 338
    iget-object v5, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 339
    .line 340
    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 341
    .line 342
    .line 343
    :goto_5
    iget-object v5, v0, Lj6/d;->q:Ljava/nio/ByteBuffer;

    .line 344
    .line 345
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    iget-object v13, v0, Lj6/d;->o:Lp4/s;

    .line 350
    .line 351
    invoke-virtual {v13, v5, v12}, Lp4/s;->E([BI)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v4, v13, v12, v9}, Lr5/h0;->f(Lp4/s;II)V

    .line 355
    .line 356
    .line 357
    iget v5, v0, Lj6/d;->W:I

    .line 358
    .line 359
    add-int/2addr v5, v12

    .line 360
    iput v5, v0, Lj6/d;->W:I

    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_e
    iget-object v5, v2, Lj6/c;->j:[B

    .line 364
    .line 365
    if-eqz v5, :cond_f

    .line 366
    .line 367
    array-length v12, v5

    .line 368
    invoke-virtual {v6, v5, v12}, Lp4/s;->E([BI)V

    .line 369
    .line 370
    .line 371
    :cond_f
    :goto_6
    const-string v5, "A_OPUS"

    .line 372
    .line 373
    iget-object v12, v2, Lj6/c;->c:Ljava/lang/String;

    .line 374
    .line 375
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-eqz v5, :cond_10

    .line 380
    .line 381
    move/from16 v5, p4

    .line 382
    .line 383
    goto :goto_7

    .line 384
    :cond_10
    iget v5, v2, Lj6/c;->g:I

    .line 385
    .line 386
    if-lez v5, :cond_11

    .line 387
    .line 388
    const/4 v5, 0x1

    .line 389
    goto :goto_7

    .line 390
    :cond_11
    const/4 v5, 0x0

    .line 391
    :goto_7
    if-eqz v5, :cond_12

    .line 392
    .line 393
    iget v5, v0, Lj6/d;->R:I

    .line 394
    .line 395
    const/high16 v12, 0x10000000

    .line 396
    .line 397
    or-int/2addr v5, v12

    .line 398
    iput v5, v0, Lj6/d;->R:I

    .line 399
    .line 400
    iget-object v5, v0, Lj6/d;->p:Lp4/s;

    .line 401
    .line 402
    invoke-virtual {v5, v10}, Lp4/s;->D(I)V

    .line 403
    .line 404
    .line 405
    iget v5, v6, Lp4/s;->c:I

    .line 406
    .line 407
    add-int/2addr v5, v3

    .line 408
    iget v12, v0, Lj6/d;->V:I

    .line 409
    .line 410
    sub-int/2addr v5, v12

    .line 411
    invoke-virtual {v11, v7}, Lp4/s;->D(I)V

    .line 412
    .line 413
    .line 414
    iget-object v12, v11, Lp4/s;->a:[B

    .line 415
    .line 416
    shr-int/lit8 v13, v5, 0x18

    .line 417
    .line 418
    and-int/lit16 v13, v13, 0xff

    .line 419
    .line 420
    int-to-byte v13, v13

    .line 421
    aput-byte v13, v12, v10

    .line 422
    .line 423
    shr-int/lit8 v13, v5, 0x10

    .line 424
    .line 425
    and-int/lit16 v13, v13, 0xff

    .line 426
    .line 427
    int-to-byte v13, v13

    .line 428
    aput-byte v13, v12, v9

    .line 429
    .line 430
    shr-int/lit8 v13, v5, 0x8

    .line 431
    .line 432
    and-int/lit16 v13, v13, 0xff

    .line 433
    .line 434
    int-to-byte v13, v13

    .line 435
    aput-byte v13, v12, v8

    .line 436
    .line 437
    and-int/lit16 v5, v5, 0xff

    .line 438
    .line 439
    int-to-byte v5, v5

    .line 440
    const/4 v13, 0x3

    .line 441
    aput-byte v5, v12, v13

    .line 442
    .line 443
    invoke-interface {v4, v11, v7, v8}, Lr5/h0;->f(Lp4/s;II)V

    .line 444
    .line 445
    .line 446
    iget v5, v0, Lj6/d;->W:I

    .line 447
    .line 448
    add-int/2addr v5, v7

    .line 449
    iput v5, v0, Lj6/d;->W:I

    .line 450
    .line 451
    :cond_12
    iput-boolean v9, v0, Lj6/d;->Y:Z

    .line 452
    .line 453
    :cond_13
    iget v5, v6, Lp4/s;->c:I

    .line 454
    .line 455
    add-int/2addr v3, v5

    .line 456
    const-string v5, "V_MPEG4/ISO/AVC"

    .line 457
    .line 458
    iget-object v11, v2, Lj6/c;->c:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-nez v5, :cond_18

    .line 465
    .line 466
    const-string v5, "V_MPEGH/ISO/HEVC"

    .line 467
    .line 468
    iget-object v11, v2, Lj6/c;->c:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v5

    .line 474
    if-eqz v5, :cond_14

    .line 475
    .line 476
    goto :goto_b

    .line 477
    :cond_14
    iget-object v5, v2, Lj6/c;->V:Lr5/i0;

    .line 478
    .line 479
    if-eqz v5, :cond_16

    .line 480
    .line 481
    iget v5, v6, Lp4/s;->c:I

    .line 482
    .line 483
    if-nez v5, :cond_15

    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_15
    const/4 v9, 0x0

    .line 487
    :goto_8
    invoke-static {v9}, Lp4/c;->i(Z)V

    .line 488
    .line 489
    .line 490
    iget-object v5, v2, Lj6/c;->V:Lr5/i0;

    .line 491
    .line 492
    invoke-virtual {v5, v1}, Lr5/i0;->c(Lr5/o;)V

    .line 493
    .line 494
    .line 495
    :cond_16
    :goto_9
    iget v5, v0, Lj6/d;->V:I

    .line 496
    .line 497
    if-ge v5, v3, :cond_1c

    .line 498
    .line 499
    sub-int v5, v3, v5

    .line 500
    .line 501
    invoke-virtual {v6}, Lp4/s;->a()I

    .line 502
    .line 503
    .line 504
    move-result v8

    .line 505
    if-lez v8, :cond_17

    .line 506
    .line 507
    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    invoke-interface {v4, v5, v6}, Lr5/h0;->e(ILp4/s;)V

    .line 512
    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_17
    invoke-interface {v4, v1, v5, v10}, Lr5/h0;->d(Lm4/i;IZ)I

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    :goto_a
    iget v8, v0, Lj6/d;->V:I

    .line 520
    .line 521
    add-int/2addr v8, v5

    .line 522
    iput v8, v0, Lj6/d;->V:I

    .line 523
    .line 524
    iget v8, v0, Lj6/d;->W:I

    .line 525
    .line 526
    add-int/2addr v8, v5

    .line 527
    iput v8, v0, Lj6/d;->W:I

    .line 528
    .line 529
    goto :goto_9

    .line 530
    :cond_18
    :goto_b
    iget-object v5, v0, Lj6/d;->h:Lp4/s;

    .line 531
    .line 532
    iget-object v11, v5, Lp4/s;->a:[B

    .line 533
    .line 534
    aput-byte v10, v11, v10

    .line 535
    .line 536
    aput-byte v10, v11, v9

    .line 537
    .line 538
    aput-byte v10, v11, v8

    .line 539
    .line 540
    iget v8, v2, Lj6/c;->a0:I

    .line 541
    .line 542
    rsub-int/lit8 v9, v8, 0x4

    .line 543
    .line 544
    :goto_c
    iget v12, v0, Lj6/d;->V:I

    .line 545
    .line 546
    if-ge v12, v3, :cond_1c

    .line 547
    .line 548
    iget v12, v0, Lj6/d;->X:I

    .line 549
    .line 550
    if-nez v12, :cond_1a

    .line 551
    .line 552
    invoke-virtual {v6}, Lp4/s;->a()I

    .line 553
    .line 554
    .line 555
    move-result v12

    .line 556
    invoke-static {v8, v12}, Ljava/lang/Math;->min(II)I

    .line 557
    .line 558
    .line 559
    move-result v12

    .line 560
    add-int v13, v9, v12

    .line 561
    .line 562
    sub-int v14, v8, v12

    .line 563
    .line 564
    invoke-interface {v1, v11, v13, v14}, Lr5/o;->readFully([BII)V

    .line 565
    .line 566
    .line 567
    if-lez v12, :cond_19

    .line 568
    .line 569
    invoke-virtual {v6, v11, v9, v12}, Lp4/s;->e([BII)V

    .line 570
    .line 571
    .line 572
    :cond_19
    iget v12, v0, Lj6/d;->V:I

    .line 573
    .line 574
    add-int/2addr v12, v8

    .line 575
    iput v12, v0, Lj6/d;->V:I

    .line 576
    .line 577
    invoke-virtual {v5, v10}, Lp4/s;->G(I)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v5}, Lp4/s;->y()I

    .line 581
    .line 582
    .line 583
    move-result v12

    .line 584
    iput v12, v0, Lj6/d;->X:I

    .line 585
    .line 586
    iget-object v12, v0, Lj6/d;->g:Lp4/s;

    .line 587
    .line 588
    invoke-virtual {v12, v10}, Lp4/s;->G(I)V

    .line 589
    .line 590
    .line 591
    invoke-interface {v4, v7, v12}, Lr5/h0;->e(ILp4/s;)V

    .line 592
    .line 593
    .line 594
    iget v12, v0, Lj6/d;->W:I

    .line 595
    .line 596
    add-int/2addr v12, v7

    .line 597
    iput v12, v0, Lj6/d;->W:I

    .line 598
    .line 599
    goto :goto_c

    .line 600
    :cond_1a
    invoke-virtual {v6}, Lp4/s;->a()I

    .line 601
    .line 602
    .line 603
    move-result v13

    .line 604
    if-lez v13, :cond_1b

    .line 605
    .line 606
    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    .line 607
    .line 608
    .line 609
    move-result v12

    .line 610
    invoke-interface {v4, v12, v6}, Lr5/h0;->e(ILp4/s;)V

    .line 611
    .line 612
    .line 613
    goto :goto_d

    .line 614
    :cond_1b
    invoke-interface {v4, v1, v12, v10}, Lr5/h0;->d(Lm4/i;IZ)I

    .line 615
    .line 616
    .line 617
    move-result v12

    .line 618
    :goto_d
    iget v13, v0, Lj6/d;->V:I

    .line 619
    .line 620
    add-int/2addr v13, v12

    .line 621
    iput v13, v0, Lj6/d;->V:I

    .line 622
    .line 623
    iget v13, v0, Lj6/d;->W:I

    .line 624
    .line 625
    add-int/2addr v13, v12

    .line 626
    iput v13, v0, Lj6/d;->W:I

    .line 627
    .line 628
    iget v13, v0, Lj6/d;->X:I

    .line 629
    .line 630
    sub-int/2addr v13, v12

    .line 631
    iput v13, v0, Lj6/d;->X:I

    .line 632
    .line 633
    goto :goto_c

    .line 634
    :cond_1c
    const-string v1, "A_VORBIS"

    .line 635
    .line 636
    iget-object v2, v2, Lj6/c;->c:Ljava/lang/String;

    .line 637
    .line 638
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    if-eqz v1, :cond_1d

    .line 643
    .line 644
    iget-object v1, v0, Lj6/d;->j:Lp4/s;

    .line 645
    .line 646
    invoke-virtual {v1, v10}, Lp4/s;->G(I)V

    .line 647
    .line 648
    .line 649
    invoke-interface {v4, v7, v1}, Lr5/h0;->e(ILp4/s;)V

    .line 650
    .line 651
    .line 652
    iget v1, v0, Lj6/d;->W:I

    .line 653
    .line 654
    add-int/2addr v1, v7

    .line 655
    iput v1, v0, Lj6/d;->W:I

    .line 656
    .line 657
    :cond_1d
    iget v1, v0, Lj6/d;->W:I

    .line 658
    .line 659
    invoke-virtual {v0}, Lj6/d;->m()V

    .line 660
    .line 661
    .line 662
    return v1
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
.end method

.method public final p(Lr5/o;[BI)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int/2addr v0, p3

    .line 3
    iget-object v1, p0, Lj6/d;->m:Lp4/s;

    .line 4
    .line 5
    iget-object v2, v1, Lp4/s;->a:[B

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    add-int v2, v0, p3

    .line 12
    .line 13
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    array-length v3, v2

    .line 21
    invoke-virtual {v1, v2, v3}, Lp4/s;->E([BI)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    array-length v3, p2

    .line 26
    invoke-static {p2, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v1, Lp4/s;->a:[B

    .line 30
    .line 31
    array-length p2, p2

    .line 32
    invoke-interface {p1, v2, p2, p3}, Lr5/o;->readFully([BII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v4}, Lp4/s;->G(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Lp4/s;->F(I)V

    .line 39
    .line 40
    .line 41
    return-void
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
