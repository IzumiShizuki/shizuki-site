.class public final Lh0/p1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final g:Landroidx/media3/exoplayer/offline/u;


# instance fields
.field public final a:Lx0/a1;

.field public final b:Lx0/a1;

.field public final c:Lx0/b1;

.field public d:Lp1/c;

.field public e:J

.field public final f:Lx0/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lh0/o1;->b:Lh0/o1;

    .line 2
    .line 3
    sget-object v1, Lh0/h;->o:Lh0/h;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lg1/l;->b(Lic/n;Lic/k;)Landroidx/media3/exoplayer/offline/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lh0/p1;->g:Landroidx/media3/exoplayer/offline/u;

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
.end method

.method public constructor <init>(Lu/e1;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx0/a1;

    .line 5
    .line 6
    invoke-direct {v0, p2}, Lx0/a1;-><init>(F)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh0/p1;->a:Lx0/a1;

    .line 10
    .line 11
    new-instance p2, Lx0/a1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, v0}, Lx0/a1;-><init>(F)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lh0/p1;->b:Lx0/a1;

    .line 18
    .line 19
    new-instance p2, Lx0/b1;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p2, v0}, Lx0/b1;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lh0/p1;->c:Lx0/b1;

    .line 26
    .line 27
    sget-object p2, Lp1/c;->e:Lp1/c;

    .line 28
    .line 29
    iput-object p2, p0, Lh0/p1;->d:Lp1/c;

    .line 30
    .line 31
    sget-wide v0, Lt2/k0;->b:J

    .line 32
    .line 33
    iput-wide v0, p0, Lh0/p1;->e:J

    .line 34
    .line 35
    sget-object p2, Lx0/r0;->f:Lx0/r0;

    .line 36
    .line 37
    new-instance v0, Lx0/e1;

    .line 38
    .line 39
    invoke-direct {v0, p1, p2}, Lx0/e1;-><init>(Ljava/lang/Object;Lx0/i2;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lh0/p1;->f:Lx0/e1;

    .line 43
    .line 44
    return-void
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


# virtual methods
.method public final a(Lu/e1;Lp1/c;II)V
    .locals 8

    .line 1
    sub-int/2addr p4, p3

    .line 2
    int-to-float p4, p4

    .line 3
    iget-object v0, p0, Lh0/p1;->b:Lx0/a1;

    .line 4
    .line 5
    invoke-virtual {v0, p4}, Lx0/a1;->f(F)V

    .line 6
    .line 7
    .line 8
    iget v0, p2, Lp1/c;->a:F

    .line 9
    .line 10
    iget v1, p2, Lp1/c;->b:F

    .line 11
    .line 12
    iget-object v2, p0, Lh0/p1;->d:Lp1/c;

    .line 13
    .line 14
    iget v3, v2, Lp1/c;->a:F

    .line 15
    .line 16
    iget-object v4, p0, Lh0/p1;->a:Lx0/a1;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    cmpg-float v3, v0, v3

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget v2, v2, Lp1/c;->b:F

    .line 24
    .line 25
    cmpg-float v2, v1, v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    goto :goto_4

    .line 30
    :cond_0
    sget-object v2, Lu/e1;->a:Lu/e1;

    .line 31
    .line 32
    if-ne p1, v2, :cond_1

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    :goto_0
    if-eqz p1, :cond_2

    .line 38
    .line 39
    move v0, v1

    .line 40
    :cond_2
    if-eqz p1, :cond_3

    .line 41
    .line 42
    iget p1, p2, Lp1/c;->d:F

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget p1, p2, Lp1/c;->c:F

    .line 46
    .line 47
    :goto_1
    invoke-virtual {v4}, Lx0/a1;->e()F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    int-to-float v2, p3

    .line 52
    add-float v3, v1, v2

    .line 53
    .line 54
    cmpl-float v6, p1, v3

    .line 55
    .line 56
    if-lez v6, :cond_4

    .line 57
    .line 58
    :goto_2
    sub-float/2addr p1, v3

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    cmpg-float v6, v0, v1

    .line 61
    .line 62
    if-gez v6, :cond_5

    .line 63
    .line 64
    sub-float v7, p1, v0

    .line 65
    .line 66
    cmpl-float v7, v7, v2

    .line 67
    .line 68
    if-lez v7, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    if-gez v6, :cond_6

    .line 72
    .line 73
    sub-float/2addr p1, v0

    .line 74
    cmpg-float p1, p1, v2

    .line 75
    .line 76
    if-gtz p1, :cond_6

    .line 77
    .line 78
    sub-float p1, v0, v1

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_6
    const/4 p1, 0x0

    .line 82
    :goto_3
    invoke-virtual {v4}, Lx0/a1;->e()F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    add-float/2addr v0, p1

    .line 87
    invoke-virtual {v4, v0}, Lx0/a1;->f(F)V

    .line 88
    .line 89
    .line 90
    iput-object p2, p0, Lh0/p1;->d:Lp1/c;

    .line 91
    .line 92
    :goto_4
    invoke-virtual {v4}, Lx0/a1;->e()F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-static {p1, v5, p4}, Lnh/b;->j(FFF)F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {v4, p1}, Lx0/a1;->f(F)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lh0/p1;->c:Lx0/b1;

    .line 104
    .line 105
    invoke-virtual {p1, p3}, Lx0/b1;->f(I)V

    .line 106
    .line 107
    .line 108
    return-void
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
.end method
