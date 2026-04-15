.class public final Ldg/a;
.super Landroid/view/SurfaceView;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Leg/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Leg/g;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldg/a;->a:Leg/g;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-interface {p1, v0}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-direct {p1, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    return-void
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
.method public final onMeasure(II)V
    .locals 12

    .line 1
    iget-object v0, p0, Ldg/a;->a:Leg/g;

    .line 2
    .line 3
    iget v1, v0, Leg/g;->d:I

    .line 4
    .line 5
    const/16 v2, 0x5a

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/16 v2, 0x10e

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    :cond_0
    move v11, p2

    .line 14
    move p2, p1

    .line 15
    move p1, v11

    .line 16
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v3, v0, Leg/g;->b:I

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    if-eqz v3, :cond_a

    .line 29
    .line 30
    iget v6, v0, Leg/g;->a:I

    .line 31
    .line 32
    if-nez v6, :cond_2

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_2
    mul-int v7, v6, v2

    .line 37
    .line 38
    mul-int v8, v1, v3

    .line 39
    .line 40
    if-le v7, v8, :cond_3

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v9, 0x0

    .line 45
    :goto_0
    iget v10, v0, Leg/g;->c:I

    .line 46
    .line 47
    packed-switch v10, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    if-eqz v9, :cond_4

    .line 51
    .line 52
    div-int p2, v8, v6

    .line 53
    .line 54
    :goto_1
    move p1, v1

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_4
    div-int p1, v7, v3

    .line 58
    .line 59
    :goto_2
    move p2, v2

    .line 60
    goto :goto_5

    .line 61
    :pswitch_0
    int-to-float p1, v1

    .line 62
    int-to-float p2, v6

    .line 63
    div-float/2addr p1, p2

    .line 64
    int-to-float p2, v2

    .line 65
    int-to-float v1, v3

    .line 66
    div-float/2addr p2, v1

    .line 67
    int-to-float v1, v5

    .line 68
    sub-float v2, p1, v1

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    sub-float v1, p2, v1

    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    cmpg-float v1, v2, v1

    .line 81
    .line 82
    if-gez v1, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    move p1, p2

    .line 86
    :goto_3
    iget p2, v0, Leg/g;->a:I

    .line 87
    .line 88
    int-to-float p2, p2

    .line 89
    mul-float p2, p2, p1

    .line 90
    .line 91
    float-to-int p2, p2

    .line 92
    iget v0, v0, Leg/g;->b:I

    .line 93
    .line 94
    int-to-float v0, v0

    .line 95
    mul-float p1, p1, v0

    .line 96
    .line 97
    float-to-int p1, p1

    .line 98
    move v11, p2

    .line 99
    move p2, p1

    .line 100
    move p1, v11

    .line 101
    goto :goto_5

    .line 102
    :pswitch_1
    if-eqz v9, :cond_6

    .line 103
    .line 104
    div-int p1, v7, v3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    div-int p2, v8, v6

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_2
    move p2, v3

    .line 111
    move p1, v6

    .line 112
    goto :goto_5

    .line 113
    :pswitch_3
    div-int/lit8 p1, v1, 0x4

    .line 114
    .line 115
    mul-int/lit8 p2, p1, 0x3

    .line 116
    .line 117
    if-le v2, p2, :cond_7

    .line 118
    .line 119
    :goto_4
    goto :goto_1

    .line 120
    :cond_7
    div-int/lit8 p1, v2, 0x3

    .line 121
    .line 122
    mul-int/lit8 p1, p1, 0x4

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :pswitch_4
    div-int/lit8 p1, v1, 0x10

    .line 126
    .line 127
    mul-int/lit8 p2, p1, 0x9

    .line 128
    .line 129
    if-le v2, p2, :cond_8

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_8
    div-int/lit8 p1, v2, 0x9

    .line 133
    .line 134
    mul-int/lit8 p1, p1, 0x10

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :pswitch_5
    if-eqz v9, :cond_9

    .line 138
    .line 139
    div-int p2, v8, v6

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_9
    div-int p1, v7, v3

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :goto_5
    :pswitch_6
    filled-new-array {p1, p2}, [I

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    goto :goto_7

    .line 150
    :cond_a
    :goto_6
    filled-new-array {v1, v2}, [I

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    :goto_7
    aget p2, p1, v4

    .line 155
    .line 156
    aget p1, p1, v5

    .line 157
    .line 158
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final setScaleType(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/a;->a:Leg/g;

    .line 2
    .line 3
    iput p1, v0, Leg/g;->c:I

    .line 4
    .line 5
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final setVideoRotation(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/a;->a:Leg/g;

    .line 2
    .line 3
    iput p1, v0, Leg/g;->d:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    return-void
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
