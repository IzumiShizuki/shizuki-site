.class public final Lr5/t;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:Lm0/w;

.field public final l:Lm4/n0;


# direct methods
.method public constructor <init>(IIIIIIIJLm0/w;Lm4/n0;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput p1, p0, Lr5/t;->a:I

    .line 19
    iput p2, p0, Lr5/t;->b:I

    .line 20
    iput p3, p0, Lr5/t;->c:I

    .line 21
    iput p4, p0, Lr5/t;->d:I

    .line 22
    iput p5, p0, Lr5/t;->e:I

    .line 23
    invoke-static {p5}, Lr5/t;->d(I)I

    move-result p1

    iput p1, p0, Lr5/t;->f:I

    .line 24
    iput p6, p0, Lr5/t;->g:I

    .line 25
    iput p7, p0, Lr5/t;->h:I

    .line 26
    invoke-static {p7}, Lr5/t;->a(I)I

    move-result p1

    iput p1, p0, Lr5/t;->i:I

    .line 27
    iput-wide p8, p0, Lr5/t;->j:J

    .line 28
    iput-object p10, p0, Lr5/t;->k:Lm0/w;

    .line 29
    iput-object p11, p0, Lr5/t;->l:Lm4/n0;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lp4/r;

    .line 3
    array-length v1, p1

    invoke-direct {v0, p1, v1}, Lp4/r;-><init>([BI)V

    mul-int/lit8 p2, p2, 0x8

    .line 4
    invoke-virtual {v0, p2}, Lp4/r;->q(I)V

    const/16 p1, 0x10

    .line 5
    invoke-virtual {v0, p1}, Lp4/r;->i(I)I

    move-result p2

    iput p2, p0, Lr5/t;->a:I

    .line 6
    invoke-virtual {v0, p1}, Lp4/r;->i(I)I

    move-result p1

    iput p1, p0, Lr5/t;->b:I

    const/16 p1, 0x18

    .line 7
    invoke-virtual {v0, p1}, Lp4/r;->i(I)I

    move-result p2

    iput p2, p0, Lr5/t;->c:I

    .line 8
    invoke-virtual {v0, p1}, Lp4/r;->i(I)I

    move-result p1

    iput p1, p0, Lr5/t;->d:I

    const/16 p1, 0x14

    .line 9
    invoke-virtual {v0, p1}, Lp4/r;->i(I)I

    move-result p1

    iput p1, p0, Lr5/t;->e:I

    .line 10
    invoke-static {p1}, Lr5/t;->d(I)I

    move-result p1

    iput p1, p0, Lr5/t;->f:I

    const/4 p1, 0x3

    .line 11
    invoke-virtual {v0, p1}, Lp4/r;->i(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lr5/t;->g:I

    const/4 p1, 0x5

    .line 12
    invoke-virtual {v0, p1}, Lp4/r;->i(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lr5/t;->h:I

    .line 13
    invoke-static {p1}, Lr5/t;->a(I)I

    move-result p1

    iput p1, p0, Lr5/t;->i:I

    const/16 p1, 0x24

    .line 14
    invoke-virtual {v0, p1}, Lp4/r;->k(I)J

    move-result-wide p1

    iput-wide p1, p0, Lr5/t;->j:J

    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lr5/t;->k:Lm0/w;

    .line 16
    iput-object p1, p0, Lr5/t;->l:Lm4/n0;

    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x14

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, -0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x6

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x5

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x4

    .line 28
    return p0

    .line 29
    :cond_3
    const/4 p0, 0x2

    .line 30
    return p0

    .line 31
    :cond_4
    const/4 p0, 0x1

    .line 32
    return p0
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static d(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x3

    .line 7
    return p0

    .line 8
    :sswitch_1
    const/4 p0, 0x2

    .line 9
    return p0

    .line 10
    :sswitch_2
    const/16 p0, 0xb

    .line 11
    .line 12
    return p0

    .line 13
    :sswitch_3
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :sswitch_4
    const/16 p0, 0xa

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_5
    const/16 p0, 0x9

    .line 19
    .line 20
    return p0

    .line 21
    :sswitch_6
    const/16 p0, 0x8

    .line 22
    .line 23
    return p0

    .line 24
    :sswitch_7
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :sswitch_8
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :sswitch_9
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :sswitch_a
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public final b()J
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-wide v2, p0, Lr5/t;->j:J

    .line 4
    .line 5
    cmp-long v4, v2, v0

    .line 6
    .line 7
    if-nez v4, :cond_0

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    const-wide/32 v0, 0xf4240

    .line 16
    .line 17
    .line 18
    mul-long v2, v2, v0

    .line 19
    .line 20
    iget v0, p0, Lr5/t;->e:I

    .line 21
    .line 22
    int-to-long v0, v0

    .line 23
    div-long/2addr v2, v0

    .line 24
    return-wide v2
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final c([BLm4/n0;)Lm4/q;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, -0x80

    .line 3
    .line 4
    aput-byte v1, p1, v0

    .line 5
    .line 6
    iget v0, p0, Lr5/t;->d:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, -0x1

    .line 12
    :goto_0
    iget-object v1, p0, Lr5/t;->l:Lm4/n0;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {v1, p2}, Lm4/n0;->b(Lm4/n0;)Lm4/n0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_1
    new-instance v1, Lm4/p;

    .line 22
    .line 23
    invoke-direct {v1}, Lm4/p;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "audio/flac"

    .line 27
    .line 28
    invoke-static {v2}, Lm4/o0;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iput-object v2, v1, Lm4/p;->m:Ljava/lang/String;

    .line 33
    .line 34
    iput v0, v1, Lm4/p;->n:I

    .line 35
    .line 36
    iget v0, p0, Lr5/t;->g:I

    .line 37
    .line 38
    iput v0, v1, Lm4/p;->C:I

    .line 39
    .line 40
    iget v0, p0, Lr5/t;->e:I

    .line 41
    .line 42
    iput v0, v1, Lm4/p;->D:I

    .line 43
    .line 44
    iget v0, p0, Lr5/t;->h:I

    .line 45
    .line 46
    invoke-static {v0}, Lp4/c0;->A(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iput v0, v1, Lm4/p;->E:I

    .line 51
    .line 52
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, v1, Lm4/p;->p:Ljava/util/List;

    .line 57
    .line 58
    iput-object p2, v1, Lm4/p;->k:Lm4/n0;

    .line 59
    .line 60
    new-instance p1, Lm4/q;

    .line 61
    .line 62
    invoke-direct {p1, v1}, Lm4/q;-><init>(Lm4/p;)V

    .line 63
    .line 64
    .line 65
    return-object p1
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
