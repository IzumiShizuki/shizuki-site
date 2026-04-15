.class public final Lph/e;
.super Lph/b;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final f:Lth/d;


# instance fields
.field public b:Lch/z;

.field public c:I

.field public d:Lrh/a;

.field public e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lth/d;

    .line 2
    .line 3
    new-instance v1, Lr/y1;

    .line 4
    .line 5
    sget-object v2, Lth/d;->f:[I

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lr/y1;-><init>([I)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lr/y1;

    .line 11
    .line 12
    sget-object v2, Lth/d;->g:[I

    .line 13
    .line 14
    invoke-direct {v3, v2}, Lr/y1;-><init>([I)V

    .line 15
    .line 16
    .line 17
    sget-object v4, Lth/d;->h:[I

    .line 18
    .line 19
    sget-object v5, Loh/a;->k:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct/range {v0 .. v5}, Lh1/d0;-><init>(Lr/y1;ILr/y1;[ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lph/e;->f:Lth/d;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Loh/a;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
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

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lph/e;->d:Lrh/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lrh/b;->a()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final c([BI)I
    .locals 8

    .line 1
    iget-object v0, p0, Lph/e;->e:[B

    .line 2
    .line 3
    iget-object v1, p0, Lph/e;->b:Lch/z;

    .line 4
    .line 5
    iget-object v2, p0, Lph/e;->d:Lrh/a;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    if-ge v4, p2, :cond_4

    .line 12
    .line 13
    aget-byte v7, p1, v4

    .line 14
    .line 15
    invoke-virtual {v1, v7}, Lch/z;->r(B)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    if-ne v7, v6, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    iput v1, p0, Lph/e;->c:I

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    if-ne v7, v5, :cond_1

    .line 26
    .line 27
    iput v5, p0, Lph/e;->c:I

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    if-nez v7, :cond_3

    .line 31
    .line 32
    iget v5, v1, Lch/z;->b:I

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    aget-byte v7, p1, v3

    .line 37
    .line 38
    aput-byte v7, v0, v6

    .line 39
    .line 40
    invoke-virtual {v2, v0, v3, v5}, Lrh/b;->c([BII)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    add-int/lit8 v6, v4, -0x1

    .line 45
    .line 46
    invoke-virtual {v2, p1, v6, v5}, Lrh/b;->c([BII)V

    .line 47
    .line 48
    .line 49
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    :goto_2
    sub-int/2addr p2, v6

    .line 53
    aget-byte p1, p1, p2

    .line 54
    .line 55
    aput-byte p1, v0, v3

    .line 56
    .line 57
    iget p1, p0, Lph/e;->c:I

    .line 58
    .line 59
    if-ne p1, v6, :cond_5

    .line 60
    .line 61
    iget p1, v2, Lrh/b;->b:I

    .line 62
    .line 63
    const/16 p2, 0x400

    .line 64
    .line 65
    if-le p1, p2, :cond_5

    .line 66
    .line 67
    invoke-virtual {v2}, Lrh/b;->a()F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    const p2, 0x3f733333    # 0.95f

    .line 72
    .line 73
    .line 74
    cmpl-float p1, p1, p2

    .line 75
    .line 76
    if-lez p1, :cond_5

    .line 77
    .line 78
    iput v5, p0, Lph/e;->c:I

    .line 79
    .line 80
    :cond_5
    iget p1, p0, Lph/e;->c:I

    .line 81
    .line 82
    return p1
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

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lph/e;->b:Lch/z;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lch/z;->a:I

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lph/e;->c:I

    .line 8
    .line 9
    iget-object v0, p0, Lph/e;->d:Lrh/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lrh/b;->d()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lph/e;->e:[B

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 17
    .line 18
    .line 19
    return-void
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
